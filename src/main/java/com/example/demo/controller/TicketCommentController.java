package com.example.demo.controller;

import com.example.demo.model.TicketComment;
import com.example.demo.service.TicketCommentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class TicketCommentController {

    private final TicketCommentService service;

    public TicketCommentController(TicketCommentService service) {
        this.service = service;
    }

    @PostMapping
    public TicketComment add(@RequestBody TicketComment comment) {
        return service.addComment(comment);
    }

    @GetMapping("/ticket/{ticketId}")
    public List<TicketComment> getByTicket(@PathVariable Long ticketId) {
        return service.getCommentsByTicket(ticketId);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteComment(id);
    }
}