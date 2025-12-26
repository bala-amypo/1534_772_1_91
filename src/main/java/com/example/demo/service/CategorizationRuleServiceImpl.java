package com.example.demo.service.impl;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.CategorizationRule;
import com.example.demo.repository.CategorizationRuleRepository;
import com.example.demo.service.CategorizationRuleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorizationRuleServiceImpl implements CategorizationRuleService {

    private final CategorizationRuleRepository repo;

    public CategorizationRuleServiceImpl(CategorizationRuleRepository repo) {
        this.repo = repo;
    }

    public CategorizationRule createRule(CategorizationRule rule) {
        return repo.save(rule);
    }

    public CategorizationRule getRule(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Rule not found"));
    }

    public List<CategorizationRule> getAllRules() {
        return repo.findAll();
    }

    public List<CategorizationRule> getRulesByRootCause(Long rootCauseId) {
        return repo.findByRootCause_Id(rootCauseId);
    }

    public void deleteRule(Long id) {
        if (!repo.existsById(id))
            throw new ResourceNotFoundException("Rule not found");
        repo.deleteById(id);
    }
}
