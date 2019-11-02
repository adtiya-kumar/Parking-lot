package com.justpark.models.accounts;

import com.justpark.models.Person;
import com.justpark.models.electronics.Electronics;
import com.justpark.models.parking.Floor;
import com.justpark.models.parking.Gate;
import com.justpark.models.parking.spots.Spot;

public class Admin extends Account {

    public Admin(String username, String saltedPasswordHash, Person person, AccountStatus status) {
        super(username, saltedPasswordHash, person, status);
    }

    void addFloor(Floor floor) {

    }

    void removeFloor(Floor floor) {

    }

    void modifyFloor(Floor floor) {

    }

    void addSpot(Floor floor, Spot spot) {

    }

    void removeSpot(Floor floor, Spot spot) {

    }

    void modifySpot(Floor floor, Spot spot) {

    }

    void addElectronics(Floor floor, Electronics panel) {

    }

    void removeElectronics(Floor floor, Electronics panel) {

    }

    void modifyElectronics(Floor floor, Electronics panel) {

    }

    void addGate(Floor floor, Gate gate) {

    }

    void removeGate(Floor floor, Gate gate) {

    }

    void modifyGate(Floor floor, Gate gate) {

    }
}
