package com.bridgelabz.oops.encapsulation.rideapplication;

public class VehicleMain {

    public static void main(String[] args) {

        Vehicle v1 = new Car(1, "Ravi", 15);
        Vehicle v2 = new Bike(2, "Aman", 10);
        Vehicle v3 = new Auto(3, "Suresh", 12);

        calculateRideFare(v1, 10);
        System.out.println();

        calculateRideFare(v2, 10);
        System.out.println();

        calculateRideFare(v3, 10);
    }

    // Polymorphic method
    public static void calculateRideFare(Vehicle vehicle, double distance) {
        vehicle.getVehicleDetails();
        System.out.println("Distance: " + distance + " km");
        System.out.println("Total Fare: ₹" + vehicle.calculateFare(distance));
    }
}
