package com.tourmate;

public class Activity extends Service {

    public Activity(double cost) {
        super(cost);
    }

    @Override
    public void book() {
        System.out.println("Activity booked.");
    }

    @Override
    public void cancel() {
        System.out.println("Activity booking canceled.");
    }
}
