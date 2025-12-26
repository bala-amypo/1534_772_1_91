package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class TicketCommentDTO {

    @NotNull
    private Long ticketId;

    @NotNull
    private Long userId;

    @NotBlank
    private String comment;

    public Long getTicketId() { return ticketId; }
    public void setTicketId(Long ticketId) { this.ticketId = ticketId; }

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public String getComment() { return comment; }
    public void setComment(String comment) { this.comment = comment; }
}