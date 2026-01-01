package com.bridgelabz.oops.inheritance.animal;

public class Bird extends Animal {
	public Bird (String name,int age) {
		super(name,age);
	}
	@Override
	public void makesound() {
		System.out.println("Bird is Chirping");
	}

}
