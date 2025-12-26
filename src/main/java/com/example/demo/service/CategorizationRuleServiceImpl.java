package com.example.demo.service.impl;

import com.example.demo.repository.CategorizationRuleRepository;
import com.example.demo.repository.CategoryRepository;
@Service
public class CategorizationRuleServiceImpl {

    public CategorizationRuleServiceImpl(
            CategorizationRuleRepository ruleRepository,
            CategoryRepository categoryRepository) {
    }
}