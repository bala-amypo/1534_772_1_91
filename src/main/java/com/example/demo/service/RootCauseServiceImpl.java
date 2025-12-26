package com.example.demo.service.impl;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.RootCause;
import com.example.demo.repository.RootCauseRepository;
import com.example.demo.service.RootCauseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RootCauseServiceImpl implements RootCauseService {

    private final RootCauseRepository repo;

    public RootCauseServiceImpl(RootCauseRepository repo) {
        this.repo = repo;
    }

    public RootCause createRootCause(RootCause rootCause) {
        return repo.save(rootCause);
    }

    public RootCause getRootCause(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Root cause not found"));
    }

    public List<RootCause> getAllRootCauses() {
        return repo.findAll();
    }

    public List<RootCause> getByCategory(Long categoryId) {
        return repo.findByCategory_Id(categoryId);
    }

    public void deleteRootCause(Long id) {
        if (!repo.existsById(id))
            throw new ResourceNotFoundException("Root cause not found");
        repo.deleteById(id);
    }
}