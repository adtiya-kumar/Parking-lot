package com.justpark.models.parking;

import com.justpark.models.DBObject;

public abstract class Gate extends DBObject {

    private String gateName;

    abstract void open();

    abstract void close();

    public String getGateName() {
        return gateName;
    }

    public void setGateName(String gateName) {
        this.gateName = gateName;
    }
}
