package com.justpark.models.parking;

import com.justpark.models.DBObject;
import com.justpark.models.parking.interfaces.PaymentsEnabled;

public class Gate extends DBObject implements PaymentsEnabled {

    private String gateName;
    private GateType type;
    private Attendent attendent;
    private Ticket ticket;

    void open() {

    };

    void close() {

    };

    public String getGateName() {
        return gateName;
    }

    public void setGateName(String gateName) {
        this.gateName = gateName;
    }

    public GateType getType() {
        return type;
    }

    public void setType(GateType type) {
        this.type = type;
    }

    public Attendent getAttendent() {
        return attendent;
    }

    public void setAttendent(Attendent attendent) {
        this.attendent = attendent;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void processTicket(Ticket ticket) {

    }

    @Override
    public void processPayment() {

    }
}
