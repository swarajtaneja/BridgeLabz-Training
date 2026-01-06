package com.fittrack;

public class CardioWorkout extends Workout {

    public CardioWorkout(int duration) {
        super("Cardio", duration);
    }

    @Override
    public void calculateCalories() {
        // Higher calorie burn
        caloriesBurned = duration * 10;
    }
}
