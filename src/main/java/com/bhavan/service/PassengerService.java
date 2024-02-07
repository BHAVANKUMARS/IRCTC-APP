package com.bhavan.service;

import com.bhavan.binding.Passenger;
import com.bhavan.binding.Ticket;

import java.util.Collection;

public interface PassengerService {

    Ticket bookTicket(Passenger passenger);

    Collection<Ticket> getAllTicket();

}
