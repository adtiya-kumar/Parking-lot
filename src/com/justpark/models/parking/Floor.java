package com.justpark.models.parking;

import java.util.List;

import com.justpark.models.electronics.CustomerInfoPortal;
import com.justpark.models.electronics.DisplayBoard;
import com.justpark.models.parking.spots.Spot;

public class Floor {
    private CustomerInfoPortal customerInfoPortal;
    private List<Spot> spots;
    private DisplayBoard displayBoard;
    private String name;

    public Floor(String name) {
        this.name = name;
        displayBoard = new DisplayBoard();
        spots = new ArrayList<>();
        customerInfoPortal = new CustomerInfoPortal();
    }

    public CustomerInfoPortal getCustomerInfoPortal() {
        return customerInfoPortal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCustomerInfoPortal(CustomerInfoPortal customerInfoPortal) {
        this.customerInfoPortal = customerInfoPortal;
    }

    public DisplayBoard getDisplayBoard() {
        return displayBoard;
    }

    public void setDisplayBoard(DisplayBoard displayBoard) {
        this.displayBoard = displayBoard;
    }
    }

    public void setSpots(List<Spot> spots) {
        this.spots = spots;
    }

    public DisplayBoard getDisplayBoard() {
        return displayBoard;
    }

    public void setDisplayBoard(DisplayBoard displayBoard) {
        this.displayBoard = displayBoard;
    }
}