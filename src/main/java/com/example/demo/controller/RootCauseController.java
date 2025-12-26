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

    @PostMapping
    public RootCause create(@RequestBody RootCause rootCause) {
        return service.createRootCause(rootCause);
    }

    @GetMapping("/{id}")
    public RootCause get(@PathVariable Long id) {
        return service.getRootCause(id);
    }

    @GetMapping
    public List<RootCause> getAll() {
        return service.getAllRootCauses();
    }

    @GetMapping("/category/{categoryId}")
    public List<RootCause> getByCategory(@PathVariable Long categoryId) {
        return service.getByCategory(categoryId);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteRootCause(id);
    }
}