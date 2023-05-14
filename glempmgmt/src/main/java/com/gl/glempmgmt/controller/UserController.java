package com.gl.glempmgmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.gl.glempmgmt.dao.UserService;
import com.gl.glempmgmt.dto.User;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
    private final UserService userService;

    
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }
}
