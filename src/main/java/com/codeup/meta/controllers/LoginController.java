package com.codeup.meta.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @GetMapping(path = "/")

    public String main(@ModelAttribute Model model) {
        model.addAttribute("Login Page", " more stuff");
        return "login";
    }
}
