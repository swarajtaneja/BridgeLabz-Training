package com.bridgelabz.oops.inheritance.hybridinheritance.vehiclemanagement;

public class VehicleMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ElectricVehicle ev = new ElectricVehicle(2, "Range Rover");
	        System.out.println("Electric Vehicle Details:");
	        ev.displayInfo();
	        ev.charge();

	        System.out.println();

	        PetrolVehicle pv = new PetrolVehicle(200,"Fortuner");
	        System.out.println("Petrol Vehicle Details:");
	        pv.displayInfo();
	        pv.refuel();
	}

}