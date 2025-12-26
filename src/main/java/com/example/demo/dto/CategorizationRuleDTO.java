package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CategorizationRuleDTO {

    @NotBlank
    private String keyword;

    @NotBlank
    private String matchType;

    @NotNull
    private Integer priority;

    @NotNull
    private Long rootCauseId;

    public String getKeyword() { return keyword; }
    public void setKeyword(String keyword) { this.keyword = keyword; }

    public String getMatchType() { return matchType; }
    public void setMatchType(String matchType) { this.matchType = matchType; }

    public Integer getPriority() { return priority; }
    public void setPriority(Integer priority) { this.priority = priority; }

    public Long getRootCauseId() { return rootCauseId; }
    public void setRootCauseId(Long rootCauseId) { this.rootCauseId = rootCauseId; }
}
