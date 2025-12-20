package com.example.demo.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Title is mandatory")
    private String title;

    @Size(max = 2000, message = "Description cannot exceed 2000 characters")
    @Column(length = 2000)
    private String description;

    private String location;
    private String createdBy;

    @ManyToOne
    private User user;

    @ManyToOne
    private Category assignedCategory;

    @ManyToOne
    private RootCause rootCause;

    private String urgencyLevel;

    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "ticket")
    @JsonIgnore
    private List<TicketComment> comments;

    @PrePersist
    public void prePersist() {
        createdAt = LocalDateTime.now();
        if (urgencyLevel == null) urgencyLevel = "LOW";
    }

    public Ticket() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getCreatedBy() { return createdBy; }
    public void setCreatedBy(String createdBy) { this.createdBy = createdBy; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public Category getAssignedCategory() { return assignedCategory; }
    public void setAssignedCategory(Category assignedCategory) { this.assignedCategory = assignedCategory; }

    public RootCause getRootCause() { return rootCause; }
    public void setRootCause(RootCause rootCause) { this.rootCause = rootCause; }

    public String getUrgencyLevel() { return urgencyLevel; }
    public void setUrgencyLevel(String urgencyLevel) { this.urgencyLevel = urgencyLevel; }

    public LocalDateTime getCreatedAt() { return createdAt; }

    public List<TicketComment> getComments() { return comments; }
    public void setComments(List<TicketComment> comments) { this.comments = comments; }
}
