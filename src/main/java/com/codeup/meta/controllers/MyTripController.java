package com.codeup.meta.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyTripController {
        @GetMapping(path = "/my-trips")

        public String main() {
            return "my-trips";
        }
    }

