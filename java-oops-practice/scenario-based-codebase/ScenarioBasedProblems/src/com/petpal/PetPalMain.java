package com.petpal;

public class PetPalMain {
    public static void main(String[] args) {

        Pet dog = new Dog("Buddy", 3);
        Pet cat = new Cat("Luna", 2);
        Pet bird = new Bird("Sky", 1);

        dog.feed();
        dog.play();
        dog.makeSound();

        cat.sleep();
        cat.makeSound();

        bird.play();
        bird.makeSound();

        System.out.println("Dog Mood: " + dog.getMood());
        System.out.println("Cat Energy: " + cat.getEnergy());
        System.out.println("Bird Hunger: " + bird.getHunger());
    }
}
