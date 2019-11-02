package com.justpark.models;

public abstract class DBObject {
    private final long uid; // unique id
    // auto incr -> primary key
    // memory
    private static long NEW_UID = 0;

    public DBObject() {
        this.uid = NEW_UID++;
    }

    public long getUid() {
        return uid;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        DBObject other = (DBObject) obj;
        if (uid != other.uid)
            return false;
        return true;
    }

}