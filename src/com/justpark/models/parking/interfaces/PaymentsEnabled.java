package com.justpark.models.parking.interfaces;

import com.justpark.models.parking.Ticket;

public interface PaymentsEnabled {
    public void processTicket(Ticket ticket);
}
