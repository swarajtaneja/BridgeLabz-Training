package com.parkease;

public class Bike extends Vehicle {

    public Bike(String vehicleNumber) {
        super(vehicleNumber, 20);
    }

    @Override
    public double calculateCharges(int hours) {
        double penalty = (hours > 8) ? 50 : 0;
        return (baseRate * hours) + penalty;
    }
}

