package com.codeup.meta.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @GetMapping(path= "/")
    @ResponseBody
    public String home(){
        return "Congrats!";

    }

    @GetMapping(path = "/login")

    public String login() {
//        model.addAttribute("LoginPage", " more stuff");
        return "login";
    }
}
