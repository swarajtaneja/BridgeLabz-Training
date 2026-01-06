package com.petpal;

public class Dog extends Pet {

    public Dog(String name, int age) {
        super(name, "Dog", age);
    }

    @Override
    public void feed() {
        changeHunger(-20);
        changeMood(10);
    }

    @Override
    public void play() {
        changeEnergy(-20);
        changeMood(15);
    }

    @Override
    public void sleep() {
        changeEnergy(30);
        changeHunger(10);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof!");
    }
}
