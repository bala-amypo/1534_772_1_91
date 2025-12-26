package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class TicketDTO {

    @NotBlank
    private String title;

    @NotBlank
    @Size(min = 10)
    private String description;

    private String location;

    @NotNull
    private Long userId;

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }
}