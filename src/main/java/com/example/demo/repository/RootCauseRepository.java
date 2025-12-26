package com.example.demo.repository;

import com.example.demo.model.RootCause;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RootCauseRepository extends JpaRepository<RootCause, Long> {

    List<RootCause> findByCategory_Id(Long categoryId);
}