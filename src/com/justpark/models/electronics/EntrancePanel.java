package com.justpark.models.electronics;

import com.justpark.models.parking.Ticket;
import com.justpark.models.parking.interfaces.IssuesTicket;

public class EntrancePanel extends DisplayBoard implements IssuesTicket {

    @Override
    public Ticket giveTicket() {
        return null;
    }
}