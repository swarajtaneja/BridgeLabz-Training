package com.cabbygo;

public class VehicleMain {
    public static void main(String[] args) {
        Driver driver = new Driver("Amit", "DL12345", 4.8);
        Vehicle vehicle = new Sedan("KA01AB1234");

        IRideService rideService = new RideService();
        rideService.bookRide(driver, vehicle, 12); // distance in km
        rideService.endRide();
    }
}
