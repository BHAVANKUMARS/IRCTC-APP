package com.bhavan.service.imp;

import com.bhavan.binding.Passenger;
import com.bhavan.binding.Ticket;
import com.bhavan.service.PassengerService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Service
public class PassengerServiceImp implements PassengerService {

    Map<Integer,Ticket> db = new HashMap<>();

    Random random = new Random();

    @Override
    public Ticket bookTicket(Passenger passenger) {

        Ticket ticket = new Ticket();

        int id = random.nextInt(100);

        ticket.setTicketNumber(id);

        ticket.setStatus("Confirmed");

        BeanUtils.copyProperties(passenger,ticket);

        db.put(id,ticket);

        return ticket;
    }

    @Override
    public Collection<Ticket> getAllTicket() {

        return db.values();

    }
}
