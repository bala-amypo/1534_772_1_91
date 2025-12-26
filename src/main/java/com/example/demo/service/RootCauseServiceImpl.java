package com.example.demo.service.impl;

import com.example.demo.model.RootCause;
import com.example.demo.repository.RootCauseRepository;
import com.example.demo.service.RootCauseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RootCauseServiceImpl implements RootCauseService {

    private final RootCauseRepository repository;

    public RootCauseServiceImpl(RootCauseRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<RootCause> getAllRootCauses() {
        return repository.findAll();
    }

    @Override
    public RootCause createRootCause(RootCause rootCause) {
        return repository.save(rootCause);
    }
}