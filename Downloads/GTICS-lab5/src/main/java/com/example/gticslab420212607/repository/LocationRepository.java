package com.example.gticslab420212607.repository;

import com.example.gticslab420212607.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location,String> {
}
