package com.gl.glempmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.glempmgmt.dto.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	
}

