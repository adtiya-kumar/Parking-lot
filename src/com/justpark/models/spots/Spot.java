package com.justpark.models.spots;

public abstract class Spot {
    private final SpotType type;
    private SpotStatus status;

    public SpotType getType() {
        return type;
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

}
