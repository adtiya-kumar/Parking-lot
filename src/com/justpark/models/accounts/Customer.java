package com.justpark.models.accounts;

import com.justpark.models.parking.Ticket;
import com.justpark.models.people.Person;

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
