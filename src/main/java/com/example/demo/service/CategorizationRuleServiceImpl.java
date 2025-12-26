package com.example.demo.service.impl;

import com.example.demo.model.CategorizationRule;
import com.example.demo.repository.CategorizationRuleRepository;
import com.example.demo.service.CategorizationRuleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorizationRuleServiceImpl implements CategorizationRuleService {

    private final CategorizationRuleRepository repository;

    public CategorizationRuleServiceImpl(CategorizationRuleRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<CategorizationRule> getAllRules() {
        return repository.findAll();
    }

    @Override
    public List<CategorizationRule> getRulesByCategoryId(Long categoryId) {
        return repository.findByCategory_Id(categoryId);
    }

    @Override
    public List<CategorizationRule> getRulesByKeyword(String keyword) {
        return repository.findByKeyword(keyword);
    }

    @Override
    public CategorizationRule createRule(CategorizationRule rule) {
        return repository.save(rule);
    }
}