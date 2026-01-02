package com.bridgelabz.oops.encapsulation.vehiclesystem;

import java.util.List;

public class RentalService {

    public static void processRentals(List<Vehicle> vehicles, int days) {

        for (Vehicle vehicle : vehicles) {

            double rentalCost = vehicle.calculateRentalCost(days);
            double insuranceCost = 0;

            if (vehicle instanceof Insurable) {
                insuranceCost = ((Insurable) vehicle).calculateInsurance();
            }

            System.out.println("Vehicle Type: " + vehicle.getType());
            System.out.println("Rental Cost: " + rentalCost);
            System.out.println("Insurance Cost: " + insuranceCost);
            System.out.println("Total Cost: " + (rentalCost + insuranceCost));
            System.out.println("----------------------------------");
        }
    }
}
