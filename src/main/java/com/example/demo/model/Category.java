package com.example.demo.model;

import java.util.List;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Category name is mandatory")
    @Size(min = 3, max = 50, message = "Category name must be between 3 and 50 characters")
    private String name;

    private String description;

    @OneToMany(mappedBy = "assignedCategory")
    @JsonIgnore
    private List<Ticket> tickets;

    @OneToMany(mappedBy = "category")
    @JsonIgnore
    private List<CategorizationRule> rules;

    @OneToMany(mappedBy = "category")
    @JsonIgnore
    private List<CategorizationLog> logs;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public List<Ticket> getTickets() { return tickets; }
    public void setTickets(List<Ticket> tickets) { this.tickets = tickets; }

    public List<CategorizationRule> getRules() { return rules; }
    public void setRules(List<CategorizationRule> rules) { this.rules = rules; }

    public List<CategorizationLog> getLogs() { return logs; }
    public void setLogs(List<CategorizationLog> logs) { this.logs = logs; }
}