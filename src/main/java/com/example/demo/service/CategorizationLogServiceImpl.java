package com.example.demo.service.impl;

import com.example.demo.model.CategorizationLog;
import com.example.demo.repository.CategorizationLogRepository;
import com.example.demo.service.CategorizationLogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorizationLogServiceImpl implements CategorizationLogService {

    private final CategorizationLogRepository repo;

    public CategorizationLogServiceImpl(CategorizationLogRepository repo) {
        this.repo = repo;
    }

    public List<CategorizationLog> getLogsByTicket(Long ticketId) {
        return repo.findByTicket_Id(ticketId);
    }

    public List<CategorizationLog> getLogsByRule(Long ruleId) {
        return repo.findByRule_Id(ruleId);
    }
}