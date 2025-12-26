package com.example.demo.service.impl;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.UrgencyPolicy;
import com.example.demo.repository.UrgencyPolicyRepository;

public class UrgencyPolicyServiceImpl {

    private final UrgencyPolicyRepository urgencyPolicyRepository;

    public UrgencyPolicyServiceImpl(UrgencyPolicyRepository urgencyPolicyRepository) {
        this.urgencyPolicyRepository = urgencyPolicyRepository;
    }

    public UrgencyPolicy createPolicy(UrgencyPolicy policy) {
        return urgencyPolicyRepository.save(policy);
    }

    public UrgencyPolicy getPolicy(Long id) {
        return urgencyPolicyRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Policy not found"));
    }
}