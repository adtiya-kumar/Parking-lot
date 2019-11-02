package com.justpark.models.parking;

public abstract class Gate {
    private long uid; // unique id
    // auto incr -> primary key
    // memory
    private static long NEW_UID = 0;

    private String gateName;

    abstract void open();

    abstract void close();

    public Gate() {
        this.uid = NEW_UID++;
    }
}