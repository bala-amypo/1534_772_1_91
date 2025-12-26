package com.example.demo.controller;

import com.example.demo.model.CategorizationRule;
import com.example.demo.service.CategorizationRuleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rules")
public class CategorizationRuleController {

    private final CategorizationRuleService service;

    public CategorizationRuleController(CategorizationRuleService service) {
        this.service = service;
    }

    @PostMapping
    public CategorizationRule create(@RequestBody CategorizationRule rule) {
        return service.createRule(rule);
    }

    @GetMapping("/{id}")
    public CategorizationRule get(@PathVariable Long id) {
        return service.getRule(id);
    }

    @GetMapping
    public List<CategorizationRule> getAll() {
        return service.getAllRules();
    }

    @GetMapping("/root-cause/{rootCauseId}")
    public List<CategorizationRule> getByRootCause(@PathVariable Long rootCauseId) {
        return service.getRulesByRootCause(rootCauseId);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteRule(id);
    }
}