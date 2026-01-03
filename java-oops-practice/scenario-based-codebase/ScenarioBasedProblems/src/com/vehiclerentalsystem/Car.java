package com.vehiclerentalsystem;

public class Car extends Vehicle {

    private double luxuryCharge;

    public Car(String vehicleId, String brand, double baseRate, double luxuryCharge) {
        super(vehicleId, brand, baseRate);
        this.luxuryCharge = luxuryCharge;
    }

    @Override
    public double calculateRent(int days) {
        return (baseRate * days) + luxuryCharge;
    }
}
