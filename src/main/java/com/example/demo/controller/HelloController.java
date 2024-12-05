package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.GreetingService;


// Handles all the HTTp requests and calls the services

@RestController
public class HelloController {
    @Autowired // includes all the related dependency 
    private GreetingService greetingService;
    @GetMapping("/hello") 
    public String hello() {
        return "Hello again from spring boot";
    }
    @GetMapping("/bye")
    public String bye() {
        return "bye from spring boot";
    }
    @GetMapping("/greetings")
    public String greeting() {
        return greetingService.getGreeting();
    }
}