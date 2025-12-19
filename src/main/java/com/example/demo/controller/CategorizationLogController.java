package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.demo.model.CategorizationLog;
import com.example.demo.model.Ticket;
import com.example.demo.service.CategorizationLogService;
import com.example.demo.service.TicketService;

@RestController
@RequestMapping("/api/logs")
public class CategorizationLogController {

    private final CategorizationLogService logService;
    private final TicketService ticketService;

    public CategorizationLogController(
            CategorizationLogService logService,
            TicketService ticketService) {
        this.logService = logService;
        this.ticketService = ticketService;
    }

    @GetMapping("/ticket/{ticketId}")
    public List<CategorizationLog> getLogsByTicket(@PathVariable Long ticketId) {
        Ticket ticket = ticketService.getTicketById(ticketId);
        return logService.getLogsForTicket(ticket);
    }
}