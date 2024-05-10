package com.example.gticslab420212607.controller;

import com.example.gticslab420212607.entity.Location;
import com.example.gticslab420212607.entity.Technician;
import com.example.gticslab420212607.repository.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class TecnicosController {


    final SiteRepository siteRepository;
    final DeviceRepository deviceRepository;

    final LocationRepository locationRepository;
    final TechnicianRepository technicianRepository;

    final TicketRepository TicketRepository;

    public TecnicosController(SiteRepository siteRepository,
                              LocationRepository locationRepository,
                               DeviceRepository deviceRepository, TechnicianRepository technicianRepository, TicketRepository ticketRepository){
        this.siteRepository = siteRepository;
        this.deviceRepository = deviceRepository;
        this.technicianRepository = technicianRepository;
        this.TicketRepository = ticketRepository;
        this.locationRepository = locationRepository;
    }



    @GetMapping(value ={"","/"})
    public String home(){

        return "home";
    }

    @GetMapping(value ={"/tecnicos"})
    public String lista(Model model){

        List<Technician> listaTecnicos = technicianRepository.findAll();

        model.addAttribute("listaTecnicos",listaTecnicos);

        return "Tecnicos/list";
    }




}
