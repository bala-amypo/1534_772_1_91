package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "urgency_policies")
public class UrgencyPolicy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String urgencyLevel;

    @Column(nullable = false)
    private Integer responseTimeInHours;

    public UrgencyPolicy() {}

    public Long getId() {
        return id;
    }

    public String getUrgencyLevel() {
        return urgencyLevel;
    }

    public void setUrgencyLevel(String urgencyLevel) {
        this.urgencyLevel = urgencyLevel;
    }

    public Integer getResponseTimeInHours() {
        return responseTimeInHours;
    }

    public void setResponseTimeInHours(Integer responseTimeInHours) {
        this.responseTimeInHours = responseTimeInHours;
    }
}