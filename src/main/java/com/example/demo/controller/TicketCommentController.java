package com.example.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Ticket;
import com.example.demo.model.TicketComment;
import com.example.demo.service.TicketCommentService;
import com.example.demo.service.TicketService;

@RestController
@RequestMapping("/api/ticket-comments")
public class TicketCommentController {

    private final TicketCommentService commentService;
    private final TicketService ticketService;

    public TicketCommentController(TicketCommentService commentService, TicketService ticketService) {
        this.commentService = commentService;
        this.ticketService = ticketService;
    }

    @PostMapping("/{ticketId}")
    public ResponseEntity<TicketComment> addComment(@PathVariable Long ticketId, @RequestBody TicketComment comment) {
        Ticket ticket = ticketService.getTicket(ticketId);
        comment.setTicket(ticket);
        return ResponseEntity.ok(commentService.addComment(comment));
    }

    @GetMapping("/{ticketId}")
    public ResponseEntity<List<TicketComment>> getCommentsByTicket(@PathVariable Long ticketId) {
        Ticket ticket = ticketService.getTicket(ticketId);
        return ResponseEntity.ok(commentService.getCommentsByTicket(ticket));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteComment(@PathVariable Long id) {
        commentService.deleteComment(id);
        return ResponseEntity.noContent().build();
    }
}