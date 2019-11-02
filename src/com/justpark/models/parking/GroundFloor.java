package com.justpark.models.parking;

import com.justpark.models.electronics.EntrancePanel;

public class GroundFloor extends Floor {
    public GroundFloor(String name) {
        super(name);
    }

    private EntrancePanel entrancePanel;

    public EntrancePanel getEntrancePanel() {
        return entrancePanel;
    }

    public void setEntrancePanel(EntrancePanel entrancePanel) {
        this.entrancePanel = entrancePanel;
    }
}
