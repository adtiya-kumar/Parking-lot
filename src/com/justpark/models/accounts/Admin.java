package com.justpark.models.accounts;

import com.justpark.models.people.Person;

public class Admin extends Account {

    public Admin(String username, String saltedPasswordHash, Person person, AccountStatus status) {
        super(username, saltedPasswordHash, person, status);
    }

}
