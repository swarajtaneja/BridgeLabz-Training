package com.vehiclerentalsystem;

public class Truck extends Vehicle {

    private double loadSurcharge;

    public Truck(String vehicleId, String brand, double baseRate, double loadSurcharge) {
        super(vehicleId, brand, baseRate);
        this.loadSurcharge = loadSurcharge;
    }

    @Override
    public double calculateRent(int days) {
        return (baseRate * days) + (loadSurcharge * days);
    }
}
