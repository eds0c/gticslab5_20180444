package com.example.gticslab420212607.repository;

import com.example.gticslab420212607.entity.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceRepository extends JpaRepository<Device,String> {
}
