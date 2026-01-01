package com.bridgelabz.oops.inheritance.vehicleTransportSystem;

public class Truck extends Vehicle{
	public Truck (String fuelType,double maxSpeed) {
		super(fuelType,maxSpeed);
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Vehicle : Truck");
		super.displayInfo();
	}

}
