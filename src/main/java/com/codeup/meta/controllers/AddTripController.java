package com.codeup.meta.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddTripController {
    @GetMapping(path = "/add-trip")

    public String main() {
        return "add-trip";
    }
}
