package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class RootCauseDTO {

    @NotBlank
    private String causeName;

    private String description;

    @NotNull
    private Long categoryId;

    public String getCauseName() { return causeName; }
    public void setCauseName(String causeName) { this.causeName = causeName; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Long getCategoryId() { return categoryId; }
    public void setCategoryId(Long categoryId) { this.categoryId = categoryId; }
}