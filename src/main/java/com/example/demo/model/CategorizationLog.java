package com.example.demo.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class CategorizationLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JsonIgnore
    private Ticket ticket;

    @ManyToOne
    private Category category;

    private String reason;

    private LocalDateTime categorizedAt;

    @PrePersist
    public void prePersist() {
        categorizedAt = LocalDateTime.now();
    }

    public CategorizationLog() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Ticket getTicket() { return ticket; }
    public void setTicket(Ticket ticket) { this.ticket = ticket; }

    public Category getCategory() { return category; }
    public void setCategory(Category category) { this.category = category; }

    public String getReason() { return reason; }
    public void setReason(String reason) { this.reason = reason; }

    public LocalDateTime getCategorizedAt() { return categorizedAt; }
    public void setCategorizedAt(LocalDateTime categorizedAt) { this.categorizedAt = categorizedAt; }
}
