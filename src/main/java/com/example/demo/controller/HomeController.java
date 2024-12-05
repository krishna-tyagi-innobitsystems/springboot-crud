package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


// Handles all the HTTp requests and calls the services

@Controller
public class HomeController {
    @GetMapping("/home")
    public String Home() {
        return "Home";
    } 
}
