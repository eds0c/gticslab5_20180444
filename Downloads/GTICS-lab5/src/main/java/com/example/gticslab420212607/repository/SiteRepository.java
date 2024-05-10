package com.example.gticslab420212607.repository;

import com.example.gticslab420212607.entity.Site;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SiteRepository extends JpaRepository<Site,String> {
}
