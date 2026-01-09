package com.tourmate;

public class Hotel extends Service {

    public Hotel(double cost) {
        super(cost);
    }

    @Override
    public void book() {
        System.out.println("Hotel booked.");
    }

    @Override
    public void cancel() {
        System.out.println("Hotel booking canceled.");
    }
}
