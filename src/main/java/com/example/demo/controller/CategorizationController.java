package com.example.demo.controller;

import com.example.demo.model.Ticket;
import com.example.demo.service.CategorizationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/categorize")
public class CategorizationController {

    private final CategorizationService service;

    public CategorizationController(CategorizationService service) {
        this.service = service;
    }

    @PostMapping("/{ticketId}")
    public Ticket categorize(@PathVariable Long ticketId) {
        return service.categorize(ticketId);
    }
}