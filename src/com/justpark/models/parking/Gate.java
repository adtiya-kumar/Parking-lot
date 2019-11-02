package com.justpark.models.parking;

import com.justpark.models.DBObject;

public class Gate extends DBObject {

    private String gateName;
    private GateType type;
    private Attendent attendent;

    void open() {

    };

    void close() {

    };

    public String getGateName() {
        return gateName;
    }

    public void setGateName(String gateName) {
        this.gateName = gateName;
    }

    public GateType getType() {
        return type;
    }

    public void setType(GateType type) {
        this.type = type;
    }
}
