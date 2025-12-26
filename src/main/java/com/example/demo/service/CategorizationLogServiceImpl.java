package com.example.demo.service;

import com.example.demo.model.CategorizationLog;
import com.example.demo.repository.CategorizationLogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorizationLogServiceImpl implements CategorizationLogService {

    private final CategorizationLogRepository repo;

    public CategorizationLogServiceImpl(CategorizationLogRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<CategorizationLog> getLogsByTicketId(Long ticketId) {
        return repo.findByTicket_Id(ticketId);
    }

    @Override
    public List<CategorizationLog> getLogsByCategoryId(Long categoryId) {
        return repo.findByCategory_Id(categoryId);
    }

    @Override
    public List<CategorizationLog> getLogsByRootCauseId(Long rootCauseId) {
        return repo.findByRootCause_Id(rootCauseId);
    }

    @Override
    public List<CategorizationLog> getAllLogs() {
        return repo.findAll();
    }
}