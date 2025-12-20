package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.RootCause;
import com.example.demo.repository.RootCauseRepository;
import com.example.demo.service.RootCauseService;

@Service
public class RootCauseServiceImpl implements RootCauseService {

    private final RootCauseRepository rootCauseRepository;

    public RootCauseServiceImpl(RootCauseRepository rootCauseRepository) {
        this.rootCauseRepository = rootCauseRepository;
    }

    @Override
    public RootCause createRootCause(RootCause rootCause) {
        return rootCauseRepository.save(rootCause);
    }

    @Override
    public RootCause getRootCause(Long id) {
        return rootCauseRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("RootCause not found with id: " + id));
    }

    @Override
    public List<RootCause> getAllRootCauses() {
        return rootCauseRepository.findAll();
    }

    @Override
    public RootCause updateRootCause(Long id, RootCause rootCause) {
        RootCause existing = getRootCause(id);
        existing.setName(rootCause.getName());
        existing.setDescription(rootCause.getDescription());
        return rootCauseRepository.save(existing);
    }

    @Override
    public void deleteRootCause(Long id) {
        RootCause existing = getRootCause(id);
        rootCauseRepository.delete(existing);
    }
}