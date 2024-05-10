package com.example.gticslab420212607.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Getter
@Setter
public class Site {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name="SiteID",nullable = false)
    private int siteId;

    @Column(name="SiteName",nullable = true)
    private String sitename;

    @ManyToOne
    @JoinColumn(name="LocationID",nullable = true)
    private Location locationId;

    @Column(name="InstallationDate",nullable = true)
    private Date installationDate;

    @Column(name="Latitude",nullable = true)
    private String latitude;

    @Column(name="Longitude",nullable = true)
    private String longitude;
}
