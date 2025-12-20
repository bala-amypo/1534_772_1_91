package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Ticket;
import com.example.demo.model.TicketComment;
import com.example.demo.repository.TicketCommentRepository;
import com.example.demo.service.TicketCommentService;

@Service
public class TicketCommentServiceImpl implements TicketCommentService {

    private final TicketCommentRepository commentRepository;

    public TicketCommentServiceImpl(TicketCommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public TicketComment addComment(TicketComment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public TicketComment getComment(Long id) {
        repository.findById(id)
        .orElseThrow(() ->
                new ResourceNotFoundException("Resource not found with id: " + id));
}

    @Override
    public List<TicketComment> getCommentsByTicket(Ticket ticket) {
        return commentRepository.findByTicket(ticket);
    }

    @Override
    public void deleteComment(Long id) {
        TicketComment existing = getComment(id);
        commentRepository.delete(existing);
    }
}