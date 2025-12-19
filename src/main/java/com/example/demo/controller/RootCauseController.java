package com.example.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.RootCause;
import com.example.demo.service.RootCauseService;

@RestController
@RequestMapping("/api/root-causes")
public class RootCauseController {

    private final RootCauseService rootCauseService;

    public RootCauseController(RootCauseService rootCauseService) {
        this.rootCauseService = rootCauseService;
    }

    @PostMapping
    public ResponseEntity<RootCause> create(@RequestBody RootCause rootCause) {
        return ResponseEntity.ok(rootCauseService.createRootCause(rootCause));
    }

    @GetMapping
    public ResponseEntity<List<RootCause>> getAll() {
        return ResponseEntity.ok(rootCauseService.getAllRootCauses());
    }

    @GetMapping("/{id}")
    public ResponseEntity<RootCause> get(@PathVariable Long id) {
        return ResponseEntity.ok(rootCauseService.getRootCause(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<RootCause> update(@PathVariable Long id, @RequestBody RootCause rootCause) {
        return ResponseEntity.ok(rootCauseService.updateRootCause(id, rootCause));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        rootCauseService.deleteRootCause(id);
        return ResponseEntity.noContent().build();
    }
}