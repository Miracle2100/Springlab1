package com.example.lab1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//classes mustn't be outside the packages
@Controller
public class GreetingsController {
    @GetMapping
    public String greet() {
        return "welcome";
    }
}
