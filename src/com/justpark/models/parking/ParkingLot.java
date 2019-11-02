package com.justpark.models.parking;

import java.util.List;

import com.justpark.models.Address;

public class ParkingLot {
    private List<Floor> floors;
    private List<Gate> gates;
    private Address address;

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}