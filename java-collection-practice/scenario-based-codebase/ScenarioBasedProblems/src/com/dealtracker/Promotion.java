package com.dealtracker;

public abstract class Promotion<T> {
    protected T type;
    public Promotion(T type) {
        this.type = type;
    }

    public abstract String getCode();
    public abstract double getValue();
}