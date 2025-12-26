package com.example.demo.service;

import com.example.demo.entity.Ticket;
import org.springframework.stereotype.Service;

@Service
public class CategorizationService {

    public Ticket categorizeTicket(Ticket ticket) {
        return ticket;
    }
}