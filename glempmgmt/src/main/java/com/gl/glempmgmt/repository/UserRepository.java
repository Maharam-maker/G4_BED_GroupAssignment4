package com.gl.glempmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.glempmgmt.dto.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
    User findByUsername(String username);
}
