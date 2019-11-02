package com.justpark.models.parking.spots;

import com.justpark.models.vehicles.Vehicle;

public abstract class Spot {
    private final SpotType type;
    private SpotStatus status;
    private Vehicle vehicle;

    public SpotType getType() {
        return type;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Spot(SpotType type) {
        this.type = type;
    }

    public SpotStatus getStatus() {
        return status;
    }

    public void setStatus(SpotStatus status) {
        this.status = status;
    }

    public boolean isFree() {
        return this.status.equals(SpotStatus.FREE);
    }
}
