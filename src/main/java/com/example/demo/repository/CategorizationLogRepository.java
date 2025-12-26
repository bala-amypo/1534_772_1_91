package com.example.demo.repository;

import com.example.demo.model.CategorizationLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategorizationLogRepository extends JpaRepository<CategorizationLog, Long> {

    List<CategorizationLog> findByTicket_Id(Long ticketId);

    List<CategorizationLog> findByCategory_Id(Long categoryId);

    List<CategorizationLog> findByRootCause_Id(Long rootCauseId);
}