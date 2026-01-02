package com.bridgelabz.oops.encapsulation.vehiclesystem;

public class Bike extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    public Bike(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = policyNumber;
    }

    private String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        return 200;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance (Policy Protected)";
    }
}
