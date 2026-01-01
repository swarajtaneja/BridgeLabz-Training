package com.bridgelabz.oops.inheritance.animal;

public class Dog extends Animal{
	public Dog (String name,int age) {
		super(name,age);
	}
    @Override
	public void makesound() {
		System.out.println("Dog is Barking");
	}

}
