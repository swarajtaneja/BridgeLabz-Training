package com.smarthome;

public class AC extends Appliance implements Controllable {
    public AC(double powerUsage) {
        super("AC", powerUsage);
    }

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println(getName() + " is now ON. Temperature set to 24°C.");
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println(getName() + " is now OFF.");
    }
}
