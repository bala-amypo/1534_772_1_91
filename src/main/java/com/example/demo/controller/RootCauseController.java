package com.example.demo.controller;

import com.example.demo.model.RootCause;
import com.example.demo.service.RootCauseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/root-causes")
public class RootCauseController {

    private final RootCauseService service;

    public RootCauseController(RootCauseService service) {
        this.service = service;
    }

    @GetMapping
    public List<RootCause> getAllRootCauses() {
        return service.getAllRootCauses();
    }

    @PostMapping
    public RootCause createRootCause(@RequestBody RootCause rootCause) {
        return service.createRootCause(rootCause);
    }
}