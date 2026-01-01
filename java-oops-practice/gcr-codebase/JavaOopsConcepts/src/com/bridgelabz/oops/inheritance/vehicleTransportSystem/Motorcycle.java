package com.bridgelabz.oops.inheritance.vehicleTransportSystem;

public class Motorcycle extends Vehicle {
	public Motorcycle (String fuelType,double maxSpeed) {
		super(fuelType,maxSpeed);
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Vehicle : Motorcycle");
		super.displayInfo();
	}

}
