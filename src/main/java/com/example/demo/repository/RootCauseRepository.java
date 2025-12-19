package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.RootCause;
import java.util.Optional;

public interface RootCauseRepository extends JpaRepository<RootCause, Long> {

    Optional<RootCause> findByName(String name);
}