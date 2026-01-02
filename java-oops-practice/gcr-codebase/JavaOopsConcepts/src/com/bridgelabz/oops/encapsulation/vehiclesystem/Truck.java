package com.bridgelabz.oops.encapsulation.vehiclesystem;

public class Truck extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = policyNumber;
    }

    private String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return (rentalRate * days) + 1000; // extra heavy vehicle charge
    }

    @Override
    public double calculateInsurance() {
        return 1000;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance (Policy Protected)";
    }
}
