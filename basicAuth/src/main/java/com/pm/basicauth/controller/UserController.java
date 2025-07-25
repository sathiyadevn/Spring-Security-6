package com.pm.basicauth.controller;

import com.pm.basicauth.model.User;
import com.pm.basicauth.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("register")
    public User register(@RequestBody User user) {
        return service.saveUser(user);
    }
}