package com.justpark.models.spots;

public abstract class Spot {
    private final SpotType type;

    public SpotType getType() {
        return type;
    }

    public Spot(SpotType type) {
        this.type = type;
    }

}
