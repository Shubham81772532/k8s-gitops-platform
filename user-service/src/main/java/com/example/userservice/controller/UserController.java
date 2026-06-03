package com.example.userservice.controller;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping("/health")
    public Map<String, Object> health() {

        return Map.of(
                "status", "UP",
                "service", "user-service",
                "timestamp", LocalDateTime.now()
        );
    }
        @GetMapping("/test")
        public String test() 
        {
             return "User Service is Running in Kubernetes";
        }
    @GetMapping
    public List<Map<String, Object>> getUsers() {

        return List.of(
                Map.of(
                        "id", 1,
                        "name", "Shubham",
                        "email", "shubham@gmail.com",
                        "role", "ADMIN"
                ),
                Map.of(
                        "id", 2,
                        "name", "Rahul",
                        "email", "rahul@gmail.com",
                        "role", "USER"
                )
        );
    }

    @GetMapping("/{id}")
    public Map<String, Object> getUserById(@PathVariable int id) {

        return Map.of(
                "id", id,
                "name", "Demo User",
                "email", "demo@gmail.com",
                "role", "USER"
        );
    }

    @PostMapping
    public Map<String, Object> createUser(@RequestBody Map<String, Object> user) {

        return Map.of(
                "message", "User created successfully",
                "data", user
        );
    }
}