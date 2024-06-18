package com.techm;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Marks this class as a REST controller
@RequestMapping("/api") // Maps requests to /api to this controller
public class GreetingController {

    @GetMapping("/greeting") // Handles GET requests to /api/greeting
    public String getGreeting() {
        return "Hello, Philip"; // Returns a greeting message
    }
}
