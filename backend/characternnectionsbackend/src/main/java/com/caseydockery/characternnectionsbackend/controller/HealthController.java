package com.caseydockery.characternnectionsbackend.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class HealthController {
    @GetMapping("/health")
    public String health() {
        return "Backend is running! You are awesome";
    }
}
