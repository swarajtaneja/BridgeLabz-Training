package com.bagnball;

import java.util.ArrayList;

public class PlaySchoolApp {

    public static void main(String[] args) {

        // Create some balls
        Ball b1 = new Ball("B1", "Red", "Small");
        Ball b2 = new Ball("B2", "Blue", "Medium");
        Ball b3 = new Ball("B3", "Green", "Large");
        Ball b4 = new Ball("B4", "Yellow", "Small");

        // Create some bags
        Bag bag1 = new Bag("Bag1", "Pink", 2);
        Bag bag2 = new Bag("Bag2", "Blue", 3);

        // List to store all bags
        ArrayList<Bag> bags = new ArrayList<>();
        bags.add(bag1);
        bags.add(bag2);

        // Add balls to bags
        bag1.addBall(b1); // success
        bag1.addBall(b2); // success
        bag1.addBall(b3); // fail, bag full

        bag2.addBall(b3);
        bag2.addBall(b4);

        // Display balls in each bag
        bag1.displayBalls();
        bag2.displayBalls();

        // Remove a ball
        bag2.removeBall("B3");

        // Display all bags and ball counts
        System.out.println("\nAll Bags:");
        for (Bag b : bags) {
            System.out.println(b);
        }
    }
}
