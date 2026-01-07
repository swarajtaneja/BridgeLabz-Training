package com.parkease;

import java.util.ArrayList;
import java.util.List;

public class ParkingManager {

    private List<String> bookingLogs = new ArrayList<>();

    public void parkVehicle(ParkingSlot slot, Vehicle vehicle) {
        if (slot.isAvailable() &&
            slot.getVehicleTypeAllowed().equals(vehicle.getClass().getSimpleName())) {

            slot.occupySlot();
            bookingLogs.add("Vehicle " + vehicle.getVehicleNumber() +
                    " parked at slot " + slot.getSlotId());
        } else {
            bookingLogs.add("Parking failed for vehicle " + vehicle.getVehicleNumber());
        }
    }

    public void releaseVehicle(ParkingSlot slot, Vehicle vehicle, int hours) {
        slot.freeSlot();
        double charges = vehicle.calculateCharges(hours);
        bookingLogs.add("Vehicle " + vehicle.getVehicleNumber() +
                " exited. Charges: ₹" + charges);
    }

    public void showLogs() {
        for (String log : bookingLogs) {
            System.out.println(log);
        }
    }
}
