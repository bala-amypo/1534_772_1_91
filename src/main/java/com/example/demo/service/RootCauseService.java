package com.example.demo.service;

import com.example.demo.model.RootCause;

import java.util.List;

public interface RootCauseService {

    RootCause createRootCause(RootCause rootCause);

    RootCause getRootCause(Long id);

    List<RootCause> getAllRootCauses();

    List<RootCause> getByCategory(Long categoryId);

    void deleteRootCause(Long id);
}