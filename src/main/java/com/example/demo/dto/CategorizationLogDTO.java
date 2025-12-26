package com.example.demo.dto;

public class CategorizationLogDTO {

    private Long ticketId;
    private Long ruleId;
    private String matchedKeyword;
    private String assignedCategory;
    private String assignedRootCause;

    public Long getTicketId() { return ticketId; }
    public void setTicketId(Long ticketId) { this.ticketId = ticketId; }

    public Long getRuleId() { return ruleId; }
    public void setRuleId(Long ruleId) { this.ruleId = ruleId; }

    public String getMatchedKeyword() { return matchedKeyword; }
    public void setMatchedKeyword(String matchedKeyword) { this.matchedKeyword = matchedKeyword; }

    public String getAssignedCategory() { return assignedCategory; }
    public void setAssignedCategory(String assignedCategory) { this.assignedCategory = assignedCategory; }

    public String getAssignedRootCause() { return assignedRootCause; }
    public void setAssignedRootCause(String assignedRootCause) { this.assignedRootCause = assignedRootCause; }
}