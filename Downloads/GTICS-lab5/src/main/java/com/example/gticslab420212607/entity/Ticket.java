package com.example.gticslab420212607.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Ticket {

    @Id
    @Column(name="TicketID",nullable = false)
    private String ticketId;

    @ManyToOne
    @JoinColumn(name="SiteID",nullable = true)
    private Site siteId;

    @ManyToOne
    @JoinColumn(name="TechnicianID",nullable = true)
    private Technician technicianId;

    @Column(name = "Status")
    private String status;




}
