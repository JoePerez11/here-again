package com.codeup.meta.controllers;//package com.codeup.meta.controllers;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//@Controller
//public class DiceController {
//
//
//    @GetMapping("/")
//    public String hello() {
//        return "Hello";
//    }
//
//    @GetMapping(path = "/roll-dice")
//    public String showDice() {
//        return "roll-dice";
//    }
//
//
//    @PostMapping(path = "/roll-dice")
//    public String rollDice(@RequestParam(name = "guess") Double guess, Model model) {
//        String roll;
//        if (guess == Math.floor(Math.random() * 100) * 5 + 1) {
//            roll = "Nice" + guess + " was correct! How do you do it?!";
//        } else {
//            roll = "Dude" + guess + "? Do you even Vegas bruh?!";
//        }
//
//        model.addAttribute("roll", roll);
//        return "roll-dice";
//    }
//
//        @RequestMapping(path = "/posts/{id}", method = RequestMethod.GET)
//        @ResponseBody
//        public String postEntry(@PathVariable String id) {
//
//
//            return id + id;
//        }
//
//        @RequestMapping(path = "/posts/create", method = RequestMethod.GET)
//        @ResponseBody
//        public String postForm(@PathVariable String form) {
//
//
//            return form;
//        }
//
//        @RequestMapping(path = "/posts/create", method = RequestMethod.POST)
//        @ResponseBody
//        public String subtractNumbers(@PathVariable String formData) {
//
//
//            return postForm(formData);
//        }
//    }

//Joe's code

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DiceController {
    @GetMapping(path = "/roll-dice")
    public String showDice() {
        return "roll-dice";
    }
    @PostMapping(path = "/roll-dice")
    public String rollDice(@RequestParam(name = "guess") Double guess, Model model) {
        String roll = null;
        while (true) {
            int dice1=(int)(Math.random()*6+1);
            int sum = dice1;

            System.out.println("Roll: total = " + sum);

            if (sum==2 || sum==3 || sum==12) {
                System.out.println("Sorry with a " + sum + " You LOSE :(");
                break;
            } else if(sum==7 || sum==11) {
                System.out.println("Woah!!! With a " + sum + " You WIN!!!!!!!");
                break;
            }

            // If you wanted, you could wait here for the user to confirm (e.g. with a key press)
        }

        model.addAttribute("roll", roll);
        return "roll-dice";
    }
}
