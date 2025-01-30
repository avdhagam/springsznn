package com.cars24.csms.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/appointments")
public class AppointmentsController {

    @GetMapping("/{id}")
    public String getAppointment(Integer id){
        return "got appointments";
    }
}
