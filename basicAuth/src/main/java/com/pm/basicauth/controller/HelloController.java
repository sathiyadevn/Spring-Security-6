package com.pm.basicauth.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String greet() {
        return "Hello World :)";
    }

    @GetMapping("about")
    public String about(HttpServletRequest request) {
        return "Dev with session ID: "+request.getSession().getId();
    }
}