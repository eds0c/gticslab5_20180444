package com.example.gticslab420212607.repository;


import com.example.gticslab420212607.entity.Technician;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnicianRepository extends JpaRepository<Technician,String> {
}
