package com.example.orderservice.controller;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @GetMapping("/health")
    public Map<String, Object> health() {

        return Map.of(
                "status", "UP",
                "service", "order-service",
                "timestamp", LocalDateTime.now()
        );
    }

    @GetMapping
    public List<Map<String, Object>> getOrders() {

        return List.of(
                Map.of(
                        "orderId", 101,
                        "product", "Laptop",
                        "amount", 65000,
                        "status", "CREATED"
                ),
                Map.of(
                        "orderId", 102,
                        "product", "Mobile",
                        "amount", 25000,
                        "status", "SHIPPED"
                )
        );
    }
    

    @PostMapping
    public Map<String, Object> createOrder(@RequestBody Map<String, Object> order) {

        return Map.of(
                "message", "Order created successfully",
                "data", order
        );
    }
}