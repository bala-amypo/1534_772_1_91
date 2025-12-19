package com.example.demo.service;

import java.util.List;
import com.example.demo.model.TicketComment;
import com.example.demo.model.Ticket;

public interface TicketCommentService {

    TicketComment addComment(TicketComment comment);

    TicketComment getComment(Long id);

    List<TicketComment> getCommentsByTicket(Ticket ticket);

    void deleteComment(Long id);
}