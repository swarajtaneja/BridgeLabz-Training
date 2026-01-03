package com.smarthome;

public class Light extends Appliance implements Controllable {
    public Light(double powerUsage) {
        super("Light", powerUsage);
    }

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println(getName() + " is now ON. Brightness set to 70%.");
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println(getName() + " is now OFF.");
    }
}
