package com.example.gticslab420212607.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Technician {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name="TechnicianID",nullable = false)
    private Integer technicianId;

    @Column(name="FirstName",nullable = false)
    private String firstName;

    @Column(name="LastName",nullable = false)
    private String lastName;

    @Column(name="Dni",nullable = false)
    private String dni;

    @Column(name="Phone",nullable = false)
    private String phone;

    @Column(name="Age",nullable = false)
    private int age;


}
