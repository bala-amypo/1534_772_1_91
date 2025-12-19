package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.demo.model.CategorizationRule;
import com.example.demo.service.CategorizationRuleService;

@RestController
@RequestMapping("/api/rules")
public class CategorizationRuleController {

    private final CategorizationRuleService ruleService;

    public CategorizationRuleController(CategorizationRuleService ruleService) {
        this.ruleService = ruleService;
    }

    @PostMapping
    public CategorizationRule createRule(@RequestBody CategorizationRule rule) {
        return ruleService.saveRule(rule);
    }

    @GetMapping
    public List<CategorizationRule> getAllRules() {
        return ruleService.getAllRules();
    }
}