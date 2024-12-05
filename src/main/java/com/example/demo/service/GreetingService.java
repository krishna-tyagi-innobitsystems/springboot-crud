package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service  // Marks the class as a Spring Service, making it available for dependency injection
public class GreetingService {

    public String getGreeting() {
        return "Hello from the service!";
    }
}
