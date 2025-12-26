package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "logs")
public class CategorizationLog {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Ticket ticket;

    @ManyToOne
    private CategorizationRule appliedRule;

    private LocalDateTime createdAt = LocalDateTime.now();

    public Long getId() {
        return id;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public CategorizationRule getAppliedRule() {
        return appliedRule;
    }

    public void setAppliedRule(CategorizationRule appliedRule) {
        this.appliedRule = appliedRule;
    }
}