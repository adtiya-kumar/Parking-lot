package com.justpark.models.parking;

import com.justpark.models.DBObject;

public class Gate extends DBObject {

    private String gateName;

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
}
