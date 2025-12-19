package com.example.demo.service;

import java.util.List;
import com.example.demo.model.RootCause;

public interface RootCauseService {

    RootCause createRootCause(RootCause rootCause);

    RootCause getRootCause(Long id);

    List<RootCause> getAllRootCauses();

    RootCause updateRootCause(Long id, RootCause rootCause);

    void deleteRootCause(Long id);
}
