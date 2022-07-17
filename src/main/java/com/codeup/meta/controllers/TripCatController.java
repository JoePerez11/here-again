package com.codeup.meta.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
@Controller
public class TripCatController {
        @GetMapping(path = "/trip-cat")

        public String main() {
            return "trip-cat";
        }
    }

