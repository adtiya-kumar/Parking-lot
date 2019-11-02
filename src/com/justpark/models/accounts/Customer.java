package com.justpark.models.accounts;

import com.justpark.models.Person;
import com.justpark.models.parking.Ticket;

public class Customer extends Account {

    public Customer(String username, String saltedPasswordHash, Person person, AccountStatus status) {
        super(username, saltedPasswordHash, person, status);
    }

    public Ticket getTicket() {
        return null;
    }

    public void payForTicket(Ticket ticket) {

    }
}
