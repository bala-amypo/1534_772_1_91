package com.example.demo.repository;

import com.example.demo.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

    List<Ticket> findByCreatedBy_Id(Long userId);

    List<Ticket> findByAssignedCategory_Id(Long categoryId);

    List<Ticket> findByAssignedRootCause_Id(Long rootCauseId);
}