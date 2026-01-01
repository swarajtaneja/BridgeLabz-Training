package com.bridgelabz.oops.inheritance.vehicleTransportSystem;

public class Vehicle {
	private String fuelType;
	private double maxSpeed;
	public Vehicle(String fuelType,double maxSpeed) {
		this.fuelType=fuelType;
		this.maxSpeed=maxSpeed;
		
	}
	public void displayInfo() {
		System.out.println("Fuel Type : "+fuelType);
		System.out.println("Max Speed : "+maxSpeed+"km/h");
	}
}
