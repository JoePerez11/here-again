package com.codeup.meta.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {
    @GetMapping(path = "/increment/{number}")
    @ResponseBody
    public String addOne(@PathVariable String number) {
        int num = Integer.parseInt(number);
        return num + " plus one is " + (num + 1) + "!";
    }
}
