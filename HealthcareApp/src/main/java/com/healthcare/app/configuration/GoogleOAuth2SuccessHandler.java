package com.healthcare.app.configuration;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import com.healthcare.app.model.Role;
import com.healthcare.app.model.User;
import com.healthcare.app.repository.RoleRepository;
import com.healthcare.app.repository.UserRepository;

@Component
public class GoogleOAuth2SuccessHandler implements AuthenticationSuccessHandler {

	@Autowired
	RoleRepository roleRepo;

	@Autowired
	UserRepository userRepo;

	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

	public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
			Authentication authentication) throws IOException, ServletException {
		OAuth2AuthenticationToken token = (OAuth2AuthenticationToken) authentication;
		String email = token.getPrincipal().getAttributes().get("email").toString();
		if (userRepo.findUserByEmail(email).isPresent()) {

		} else {
			User user = new User();
			user.setFirstName(token.getPrincipal().getAttributes().get("given_name").toString());
			user.setLastName(token.getPrincipal().getAttributes().get("family_name").toString());
			user.setEmail(email);
			List<Role> roles = new ArrayList<>();
			roles.add(roleRepo.findById(2).get());
			user.setRoles(roles);
			userRepo.save(user);

		}
		redirectStrategy.sendRedirect(httpServletRequest,httpServletResponse,"/");
	}

}
