package com.example.demo.service;

import com.example.demo.model.CategorizationRule;

import java.util.List;

public interface CategorizationRuleService {

    List<CategorizationRule> getAllRules();

    List<CategorizationRule> getRulesByCategoryId(Long categoryId);

    List<CategorizationRule> getRulesByKeyword(String keyword);

    CategorizationRule createRule(CategorizationRule rule);
}