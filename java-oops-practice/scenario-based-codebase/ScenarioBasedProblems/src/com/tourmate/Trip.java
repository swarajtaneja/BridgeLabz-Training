package com.tourmate;

public abstract class Trip {
    protected String destination;
    protected double budget;
    protected int duration;

    protected Transport transport;
    protected Hotel hotel;
    protected Activity activity;

    // Constructor creates a complete trip package
    public Trip(String destination, int duration,
                Transport transport, Hotel hotel, Activity activity) {
        this.destination = destination;
        this.duration = duration;
        this.transport = transport;
        this.hotel = hotel;
        this.activity = activity;
        this.budget = calculateTotalBudget();
    }

    // hotel + transport + activities
    protected double calculateTotalBudget() {
        return transport.getCost() + hotel.getCost() + activity.getCost();
    }

    public abstract void bookTrip();
}
