package com.parkease;

public class Main {
    public static void main(String[] args) {

        ParkingSlot slot1 = new ParkingSlot(101, "Basement A", "Car");
        Vehicle car = new Car("CAR-123");

        ParkingManager manager = new ParkingManager();

        manager.parkVehicle(slot1, car);
        manager.releaseVehicle(slot1, car, 6);

        manager.showLogs();
    }
}
