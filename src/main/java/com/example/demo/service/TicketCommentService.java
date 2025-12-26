package com.example.demo.service;

import com.example.demo.model.TicketComment;

import java.util.List;

public interface TicketCommentService {

    TicketComment addComment(TicketComment comment);

    List<TicketComment> getCommentsByTicket(Long ticketId);

    void deleteComment(Long id);
}