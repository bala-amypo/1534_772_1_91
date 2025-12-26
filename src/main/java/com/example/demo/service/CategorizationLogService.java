package com.example.demo.service;

import com.example.demo.model.CategorizationLog;

import java.util.List;

public interface CategorizationLogService {

    List<CategorizationLog> getLogsByTicketId(Long ticketId);

    List<CategorizationLog> getLogsByCategoryId(Long categoryId);

    List<CategorizationLog> getLogsByRootCauseId(Long rootCauseId);

    List<CategorizationLog> getAllLogs();
}