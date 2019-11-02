package com.justpark.models.accounts;

import com.justpark.models.parking.Ticket;
import com.justpark.models.parking.interfaces.IssuesTicket;
import com.justpark.models.parking.interfaces.PaymentsEnabled;
import com.justpark.models.people.Person;

public class Attendent extends Account implements IssuesTicket, PaymentsEnabled {

    public Attendent(String username, String saltedPasswordHash, Person person, AccountStatus status) {
        super(username, saltedPasswordHash, person, status);
    }

    @Override
    public Ticket giveTicket() {
        return null;
    }

    @Override
    public void processTicket(Ticket ticket) {

    }

    @Override
    public void processPayment() {

    }

}
