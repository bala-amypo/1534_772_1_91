package com.example.demo.controller;

import com.example.demo.model.CategorizationRule;
import com.example.demo.service.CategorizationRuleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorization-rules")
public class CategorizationRuleController {

    private final CategorizationRuleService service;

    public CategorizationRuleController(CategorizationRuleService service) {
        this.service = service;
    }

    @GetMapping
    public List<CategorizationRule> getAllRules() {
        return service.getAllRules();
    }

    @GetMapping("/category/{categoryId}")
    public List<CategorizationRule> getRulesByCategory(@PathVariable Long categoryId) {
        return service.getRulesByCategoryId(categoryId);
    }

    @GetMapping("/keyword/{keyword}")
    public List<CategorizationRule> getRulesByKeyword(@PathVariable String keyword) {
        return service.getRulesByKeyword(keyword);
    }

    @PostMapping
    public CategorizationRule createRule(@RequestBody CategorizationRule rule) {
        return service.createRule(rule);
    }
}