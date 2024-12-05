package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.GreetingService;

@RestController
public class HelloController {
    private final GreetingService greetingService;
    @GetMapping("/hello") 
    public String hello() {
        return "Hello again from spring boot";
    }
    @GetMapping("/bye")
    public String bye() {
        return "bye from spring boot";
    }
    public HelloController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    @GetMapping("/greetings")
    public String greeting() {
        return greetingService.getGreeting();
    }
    
}