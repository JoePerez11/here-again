package com.codeup.meta.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping(path = "/login")

    public String login() {
//        model.addAttribute("LoginPage", " more stuff");
        return "login";
    }
}
