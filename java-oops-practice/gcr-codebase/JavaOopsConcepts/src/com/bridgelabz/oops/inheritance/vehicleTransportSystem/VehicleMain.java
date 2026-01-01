package com.bridgelabz.oops.inheritance.vehicleTransportSystem;

public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle c1 = new Car("Diesel",160,7);
		Vehicle t1 = new Truck("Petrol",150);
		Vehicle mc1 = new Motorcycle("Petrol",120);
		
		c1.displayInfo();
		System.out.println();
		t1.displayInfo();
		System.out.println();
		mc1.displayInfo();

	}

}
