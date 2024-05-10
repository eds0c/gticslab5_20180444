package com.example.gticslab420212607.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Device {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name="DeviceID",nullable = false)
    private Integer deviceId;

    @Column(name="DeviceName")
    private String devicename;

    @Column(name="DeviceType")
    private String devicetype;

    @Column(name="Model")
    private String model;

    @Column(name="SerialNumber")
    private String serialnumber;

    @ManyToOne
    @JoinColumn(name = "SiteID")
    private Site siteId;

}
