package com.bridgelabz.oops.encapsulation.vehiclesystem;

import java.util.ArrayList;
import java.util.List;

public class VehicleMain{

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("CAR101", 2000, "C-INS-001"));
        vehicles.add(new Bike("BIKE202", 800, "B-INS-002"));
        vehicles.add(new Truck("TRK303", 5000, "T-INS-003"));

        RentalService.processRentals(vehicles, 3);
    }
}
