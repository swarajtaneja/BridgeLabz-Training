package com.smarthome;

public class Fan extends Appliance implements Controllable {
    public Fan(double powerUsage) {
        super("Fan", powerUsage);
    }

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println(getName() + " is now ON. Speed set to medium.");
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println(getName() + " is now OFF.");
    }
}
