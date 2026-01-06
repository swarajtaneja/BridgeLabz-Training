package com.petpal;

public class Cat extends Pet {

    public Cat(String name, int age) {
        super(name, "Cat", age);
    }

    @Override
    public void feed() {
        changeHunger(-15);
        changeMood(5);
    }

    @Override
    public void play() {
        changeEnergy(-15);
        changeMood(10);
    }

    @Override
    public void sleep() {
        changeEnergy(40);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}
