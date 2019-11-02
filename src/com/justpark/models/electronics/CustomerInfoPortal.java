package com.justpark.models.electronics;

import com.justpark.models.parking.Ticket;
import com.justpark.models.parking.interfaces.PaymentsEnabled;;

public class CustomerInfoPortal extends Electronics implements PaymentsEnabled {

    @Override
    public void processTicket(Ticket ticket) {

    }

    @Override
    public void processPayment() {
    }

}
