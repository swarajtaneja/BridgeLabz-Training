package com.smarthome;

public class Appliance {
    private String name;
    private boolean isOn;
    private double powerUsage; // in Watts

    // Constructor: default or user-defined power
    public Appliance(String name, double powerUsage) {
        this.name = name;
        this.powerUsage = powerUsage;
        this.isOn = false;
    }

    // Encapsulation: internal state access
    public boolean isOn() {
        return isOn;
    }

    protected void setOn(boolean state) {
        this.isOn = state;
    }

    public double getPowerUsage() {
        return powerUsage;
    }

    public String getName() {
        return name;
    }
}
