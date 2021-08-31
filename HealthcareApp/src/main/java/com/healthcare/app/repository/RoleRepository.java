package com.healthcare.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.healthcare.app.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

	
}
