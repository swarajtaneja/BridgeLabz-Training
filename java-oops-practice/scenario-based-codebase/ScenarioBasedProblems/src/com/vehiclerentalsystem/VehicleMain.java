package com.vehiclerentalsystem;

public class VehicleMain {
    public static void main(String[] args) {

        Vehicle bike = new Bike("B101", "Yamaha", 20);
        Vehicle car = new Car("C202", "Toyota", 50, 100);
        Vehicle truck = new Truck("T303", "Volvo", 80, 30);

        Customer customer = new Customer("CU01", "Sakuntala");

        customer.rentVehicle(bike, 3);
        customer.rentVehicle(car, 5);
        customer.rentVehicle(truck, 2);
    }
}
