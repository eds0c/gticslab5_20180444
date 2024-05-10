package com.example.gticslab420212607.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Location {

    @Id
    @Column(name="LocationID",nullable = false)
    private int locationId;

    @Column(name="City",nullable = true)
    private String city;

    @Column(name="Country",nullable = true)
    private String country;



}
