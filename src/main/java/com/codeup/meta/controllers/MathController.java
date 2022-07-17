//Joe's code
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

    @GetMapping(path = "/add/{num1}/and/{num2}")
    @ResponseBody
    public int addNums(@PathVariable String num1, @PathVariable String num2) {
        int nums = Integer.parseInt(num1);
        int nums2 = Integer.parseInt(num2);
        return nums + nums2;
    }

    @GetMapping(path = "/subtract/{num1}/from/{num2}")
    @ResponseBody
    public int subtractsNums(@PathVariable String num1, @PathVariable String num2) {
        int nums = Integer.parseInt(num1);
        int nums2 = Integer.parseInt(num2);
        return nums2 - nums;
    }

    @GetMapping(path = "/multiply/{num1}/and/{num2}")
    @ResponseBody
    public int multiplyNums(@PathVariable String num1, @PathVariable String num2) {
        int nums = Integer.parseInt(num1);
        int nums2 = Integer.parseInt(num2);
        return nums2 * nums;
    }

    @GetMapping(path = "/divide/{num1}/by/{num2}")
    @ResponseBody
    public int dividesNums(@PathVariable String num1, @PathVariable String num2) {
        int nums = Integer.parseInt(num1);
        int nums2 = Integer.parseInt(num2);
        return nums / nums2;
    }
}
