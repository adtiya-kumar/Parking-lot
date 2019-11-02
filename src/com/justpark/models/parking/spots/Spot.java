package com.justpark.models.parking.spots;

import com.justpark.exceptions.SpotAlreadyOccupiedException;
import com.justpark.exceptions.MalformedVehicleException;
import com.justpark.exceptions.SpotAlreadyFreeException;
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

    public void park(Vehicle vehicle) throws SpotAlreadyOccupiedException, MalformedVehicleException {
        if (this.isFree()) {
            throw new SpotAlreadyOccupiedException(this.toString() + " is already occupied");
        }
        if (!vehicle.getType().getFitsIn().contains(this.getType())) {
            throw new MalformedVehicleException(this.toString() + " is already occupied");
        }
    }

    public Vehicle unPark() throws SpotAlreadyFreeException {
        if (!status.equals(SpotStatus.OCCUPIED))
            throw new SpotAlreadyFreeException(this.toString() + " is already free!");
        Vehicle vehicle = this.vehicle;
        this.vehicle = null;
        status = SpotStatus.FREE;
        return vehicle;
    }

    @Override
    public String toString() {
        return "Spot{" + "type=" + type + ", status=" + status + ", vehicle=" + vehicle + '}';
    }
}
