package com.codeup.meta.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShowController {

    @GetMapping("/show")
    public String welcome() {
        return "views/show";
    }
}
