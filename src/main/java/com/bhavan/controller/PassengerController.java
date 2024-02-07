package com.bhavan.controller;

import com.bhavan.binding.Passenger;
import com.bhavan.binding.Ticket;
import com.bhavan.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class PassengerController {

    @Autowired
    private PassengerService passengerService;

    @PostMapping(value = "/bookTicket",produces = "application/json",consumes = "application/json")
    public Ticket bookTicket(@RequestBody Passenger passenger){

        return passengerService.bookTicket(passenger);

    }

    @GetMapping(value = "/getAllTickets",produces = "application/json")
    public Collection<Ticket> getAllTickets(){

        return passengerService.getAllTicket();

    }

}
