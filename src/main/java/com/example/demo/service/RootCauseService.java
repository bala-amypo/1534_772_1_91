package com.example.demo.service;

import com.example.demo.model.RootCause;

import java.util.List;

public interface RootCauseService {

    List<RootCause> getAllRootCauses();

    RootCause createRootCause(RootCause rootCause);
}