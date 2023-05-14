package com.gl.glempmgmt.dao;

import org.springframework.stereotype.Service;

import com.gl.glempmgmt.dto.Role;
import com.gl.glempmgmt.repository.RoleRepository;

@Service
public class RoleService {
    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Role createRole(Role role) {
        return roleRepository.save(role);
    }
}
