package com.tourmate;

public abstract class Service implements IBookable {
    private double cost; // hidden cost breakdown

    public Service(double cost) {
        this.cost = cost;
    }

    protected double getCost() {
        return cost;
    }
}
