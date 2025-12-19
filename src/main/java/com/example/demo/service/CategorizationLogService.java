package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.CategorizationLog;
import com.example.demo.model.Ticket;
import com.example.demo.repository.CategorizationLogRepository;

@Service
public class CategorizationLogService {

    private final CategorizationLogRepository logRepository;

    public CategorizationLogService(CategorizationLogRepository logRepository) {
        this.logRepository = logRepository;
    }

    public CategorizationLog saveLog(CategorizationLog log) {
        return logRepository.save(log);
    }

    public List<CategorizationLog> getLogsForTicket(Ticket ticket) {
        return logRepository.findByTicket(ticket);
    }
}