package com.example.gticslab420212607.repository;

import com.example.gticslab420212607.entity.Site;
import com.example.gticslab420212607.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, String> {
}
