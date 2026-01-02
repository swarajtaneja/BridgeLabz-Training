package com.bridgelabz.oops.encapsulation.vehiclesystem;

public class Car extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    public Car(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = policyNumber;
    }

    // Encapsulation: No direct access to policy number
    private String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        return 500; // flat insurance cost
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance (Policy Protected)";
    }
}
