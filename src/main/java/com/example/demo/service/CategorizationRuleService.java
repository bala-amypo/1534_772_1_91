package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.CategorizationRule;
import com.example.demo.repository.CategorizationRuleRepository;

@Service
public class CategorizationRuleService {

    private final CategorizationRuleRepository ruleRepository;

    public CategorizationRuleService(CategorizationRuleRepository ruleRepository) {
        this.ruleRepository = ruleRepository;
    }

    public CategorizationRule saveRule(CategorizationRule rule) {
        return ruleRepository.save(rule);
    }

    public List<CategorizationRule> getAllRules() {
        return ruleRepository.findAll();
    }
}