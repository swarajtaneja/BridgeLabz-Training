package com.tourmate;

public class Transport extends Service {

    public Transport(double cost) {
        super(cost);
    }

    @Override
    public void book() {
        System.out.println("Transport booked.");
    }

    @Override
    public void cancel() {
        System.out.println("Transport booking canceled.");
    }
}

