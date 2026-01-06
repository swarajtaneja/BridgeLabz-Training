package com.fittrack;

public class FitTrackMain {
    public static void main(String[] args) {

        UserProfile user = new UserProfile(
                "Riya", 21, 55.0, "Weight Loss"
        );

        Workout cardio = new CardioWorkout(30);
        Workout strength = new StrengthWorkout(40);

        cardio.startWorkout();
        cardio.calculateCalories();
        cardio.stopWorkout();

        strength.startWorkout();
        strength.calculateCalories();
        strength.stopWorkout();

        int totalCalories =
                cardio.getCaloriesBurned() + strength.getCaloriesBurned();

        System.out.println("Calories Burned: " + totalCalories);

        // Operator usage for progress
        int remaining =
                user.calculateProgress(totalCalories);

        System.out.println("Remaining Calories for Today: " + remaining);
    }
}
