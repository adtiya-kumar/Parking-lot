package com.justpark.models.parking;

import java.util.List;

import com.justpark.models.electronics.CustomerInfoPortal;
import com.justpark.models.electronics.DisplayBoard;
import com.justpark.models.parking.spots.Spot;

public class Floor {
    private CustomerInfoPortal customerInfoPortal;
    private List<Spot> spots;
    private DisplayBoard displayBoard;

    public CustomerInfoPortal getCustomerInfoPortal() {
        return customerInfoPortal;
    }

    public void setCustomerInfoPortal(CustomerInfoPortal customerInfoPortal) {
        this.customerInfoPortal = customerInfoPortal;
    }

    public List<Spot> getSpots() {
        return spots;
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