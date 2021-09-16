package com.findstudygroup.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"", "/login"})
public class LoginController {
    @RequestMapping("/login")
    public String loginForm() {
        return "login/login";
    }

    @RequestMapping("/signup")
    public String registrationForm() {
        return "login/registration";
    }
}
