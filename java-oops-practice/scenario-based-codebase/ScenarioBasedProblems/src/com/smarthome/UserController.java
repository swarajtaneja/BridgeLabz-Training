package com.smarthome;

public class UserController {

    // Turn appliance ON or OFF
    public void toggleAppliance(Controllable device, boolean on) {
        if (on) {
            device.turnOn();
        } else {
            device.turnOff();
        }
    }

    // Compare energy usage between two appliances
    public void compareEnergy(Appliance a1, Appliance a2) {
        if (a1.getPowerUsage() > a2.getPowerUsage()) {
            System.out.println(a1.getName() + " uses more energy than " + a2.getName());
        } else if (a1.getPowerUsage() < a2.getPowerUsage()) {
            System.out.println(a2.getName() + " uses more energy than " + a1.getName());
        } else {
            System.out.println(a1.getName() + " and " + a2.getName() + " use the same energy");
        }
    }
}
