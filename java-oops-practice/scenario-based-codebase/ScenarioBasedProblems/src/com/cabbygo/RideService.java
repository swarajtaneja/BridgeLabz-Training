package com.cabbygo;

public class RideService implements IRideService {
    private double fare; // hidden using encapsulation
    private static final double BASE_FARE = 50.0;

    @Override
    public void bookRide(Driver driver, Vehicle vehicle, double distance) {
        fare = vehicle.calculateFare(distance, BASE_FARE);

        System.out.println("Ride booked!");
        System.out.println("Driver: " + driver.getName());
        System.out.println("Vehicle Type: " + vehicle.getType());
        System.out.println("Fare: ₹" + fare);
    }

    @Override
    public void endRide() {
        System.out.println("Ride ended. Total Fare: ₹" + fare);
    }
}
