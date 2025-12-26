package com.example.demo.service.impl;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.TicketComment;
import com.example.demo.repository.TicketCommentRepository;
import com.example.demo.service.TicketCommentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketCommentServiceImpl implements TicketCommentService {

    private final TicketCommentRepository repo;

    public TicketCommentServiceImpl(TicketCommentRepository repo) {
        this.repo = repo;
    }

    public TicketComment addComment(TicketComment comment) {
        return repo.save(comment);
    }

    public List<TicketComment> getCommentsByTicket(Long ticketId) {
        return repo.findByTicket_Id(ticketId);
    }

    public void deleteComment(Long id) {
        if (!repo.existsById(id))
            throw new ResourceNotFoundException("Comment not found");
        repo.deleteById(id);
    }
}