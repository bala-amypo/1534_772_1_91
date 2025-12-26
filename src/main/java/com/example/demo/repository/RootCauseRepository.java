package com.example.demo.repository;

import com.example.demo.model.RootCause;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RootCauseRepository extends JpaRepository<RootCause, Long> {
}