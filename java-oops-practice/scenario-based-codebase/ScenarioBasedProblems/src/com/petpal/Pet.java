package com.petpal;

import java.util.Random;

public abstract class Pet implements IInteractable {

    protected String name;
    protected String type;
    protected int age;

    // Internal states → encapsulated
    private int hunger; // 0 = full, 100 = very hungry
    private int energy; // 0 = tired, 100 = energetic
    private int mood;   // 0 = sad, 100 = happy

    // Constructor with random default values
    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;

        Random rand = new Random();
        this.hunger = rand.nextInt(50);
        this.energy = rand.nextInt(50) + 50;
        this.mood = rand.nextInt(50) + 50;
    }

    // Constructor with user-specified values
    public Pet(String name, String type, int age, int hunger, int energy, int mood) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = hunger;
        this.energy = energy;
        this.mood = mood;
    }

    // Protected helpers (internal control only)
    protected void changeHunger(int value) {
        hunger += value; // operator usage
        hunger = Math.max(0, Math.min(100, hunger));
    }

    protected void changeEnergy(int value) {
        energy += value; // operator usage
        energy = Math.max(0, Math.min(100, energy));
    }

    protected void changeMood(int value) {
        mood += value;
        mood = Math.max(0, Math.min(100, mood));
    }

    // Read-only access
    public int getHunger() {
        return hunger;
    }

    public int getEnergy() {
        return energy;
    }

    public int getMood() {
        return mood;
    }

    // Polymorphic behavior
    public abstract void makeSound();
}
