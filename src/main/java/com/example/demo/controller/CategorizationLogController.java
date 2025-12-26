package com.example.demo.controller;

import com.example.demo.model.CategorizationLog;
import com.example.demo.service.CategorizationLogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorization-logs")
public class CategorizationLogController {

    private final CategorizationLogService service;

    public CategorizationLogController(CategorizationLogService service) {
        this.service = service;
    }

    @GetMapping
    public List<CategorizationLog> getAllLogs() {
        return service.getAllLogs();
    }

    @GetMapping("/ticket/{ticketId}")
    public List<CategorizationLog> getLogsByTicketId(@PathVariable Long ticketId) {
        return service.getLogsByTicketId(ticketId);
    }

    @GetMapping("/category/{categoryId}")
    public List<CategorizationLog> getLogsByCategoryId(@PathVariable Long categoryId) {
        return service.getLogsByCategoryId(categoryId);
    }

    @GetMapping("/root-cause/{rootCauseId}")
    public List<CategorizationLog> getLogsByRootCauseId(@PathVariable Long rootCauseId) {
        return service.getLogsByRootCauseId(rootCauseId);
    }
}
