package com.bagnball;

public class Ball {

    private String ballID;
    private String color;
    private String size; // small, medium, large

    // Constructor
    public Ball(String ballID, String color, String size) {
        this.ballID = ballID;
        this.color = color;
        this.size = size;
    }

    // Getters
    public String getBallID() { return ballID; }
    public String getColor() { return color; }
    public String getSize() { return size; }

    @Override
    public String toString() {
        return "Ball[ID=" + ballID + ", Color=" + color + ", Size=" + size + "]";
    }
}
