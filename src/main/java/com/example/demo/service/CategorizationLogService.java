package com.example.demo.service;

import com.example.demo.model.CategorizationLog;

import java.util.List;

public interface CategorizationLogService {

    List<CategorizationLog> getLogsByTicket(Long ticketId);

    List<CategorizationLog> getLogsByRule(Long ruleId);
}