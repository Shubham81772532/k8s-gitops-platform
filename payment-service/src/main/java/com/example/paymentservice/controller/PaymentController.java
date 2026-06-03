package com.example.paymentservice.controller;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @GetMapping("/health")
    public Map<String, Object> health() {

        return Map.of(
                "status", "UP",
                "service", "payment-service",
                "timestamp", LocalDateTime.now()
        );
    }

    @PostMapping
    public Map<String, Object> processPayment(@RequestBody Map<String, Object> payment) {

        return Map.of(
                "message", "Payment processed successfully",
                "paymentStatus", "SUCCESS",
                "data", payment
        );
    }

    @GetMapping("/{id}")
    public Map<String, Object> getPayment(@PathVariable int id) {

        return Map.of(
                "paymentId", id,
                "status", "SUCCESS",
                "amount", 5000
        );
    }
} 