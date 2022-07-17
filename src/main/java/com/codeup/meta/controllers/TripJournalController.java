package com.codeup.meta.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TripJournalController {
    @GetMapping(path = "/trip-journal")

    public String main() {
        return "trip-journal";
    }
}
