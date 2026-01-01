package com.bridgelabz.oops.inheritance.vehicleTransportSystem;

public class Car extends Vehicle {
	private int seatCapacity;
	public Car (String fuelType,double maxSpeed,int seatCapacity) {
		super(fuelType,maxSpeed);
		this.seatCapacity=seatCapacity;
	}
	@Override
	public void displayInfo() {
		System.out.println("Vehicle : Car");
		super.displayInfo();
		System.out.println("Seat Capacity : "+seatCapacity);
	}

}
