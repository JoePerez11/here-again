package com.codeup.meta.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AboutUsController {
    @GetMapping(path= "/index")
    public String home(){
        return "about-us";

    }

}

