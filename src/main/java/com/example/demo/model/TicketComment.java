package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Column;
import jakarta.persistence.PrePersist;

import java.time.LocalDateTime;

@Entity
@Table(name = "ticket_comments")
public class TicketComment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;

    @ManyToOne
    @JoinColumn(name = "commented_by")
    private User commentedBy;

    @Column(length = 1000)
    private String comment;

    private LocalDateTime commentedAt;

    @PrePersist
    protected void onCreate() {
        commentedAt = LocalDateTime.now();
    }

    public TicketComment() {}

    public Long getId() { return id; }
    public Ticket getTicket() { return ticket; }
    public void setTicket(Ticket ticket) { this.ticket = ticket; }
    public User getCommentedBy() { return commentedBy; }
    public void setCommentedBy(User commentedBy) { this.commentedBy = commentedBy; }
    public String getComment() { return comment; }
    public void setComment(String comment) { this.comment = comment; }
}