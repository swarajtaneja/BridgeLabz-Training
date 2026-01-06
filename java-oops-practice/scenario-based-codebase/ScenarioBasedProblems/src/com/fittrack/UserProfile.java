package com.fittrack;

public class UserProfile {

    private String name;
    private int age;

    // Sensitive health data → encapsulated
    private double weight;

    private String goal;
    private int dailyCalorieTarget;

    // Constructor with default goal
    public UserProfile(String name, int age, double weight) {
        this(name, age, weight, "Maintain Fitness");
    }

    // Constructor with custom goal
    public UserProfile(String name, int age, double weight, String goal) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.goal = goal;
        this.dailyCalorieTarget = 2000; // default target
    }

    // No setter for weight → protected data
    public double getWeight() {
        return weight;
    }

    public int getDailyCalorieTarget() {
        return dailyCalorieTarget;
    }

    // Operator usage for progress calculation
    public int calculateProgress(int caloriesBurned) {
        return dailyCalorieTarget - caloriesBurned;
    }
}
