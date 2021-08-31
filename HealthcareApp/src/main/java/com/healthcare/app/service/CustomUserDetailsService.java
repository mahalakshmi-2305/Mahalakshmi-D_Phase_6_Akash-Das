package com.healthcare.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.healthcare.app.model.CustomUserDetail;
import com.healthcare.app.model.User;
import com.healthcare.app.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	UserRepository userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Optional<User> user=userRepo.findUserByEmail(email);
		user.orElseThrow(() -> new UsernameNotFoundException("User not found"));
		return user.map(CustomUserDetail::new).get();
	}
}
