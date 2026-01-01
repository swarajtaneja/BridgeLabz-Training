package com.bridgelabz.oops.inheritance.animal;

public class Cat extends Animal{
	public Cat (String name,int age) {
		super(name,age);
	}
	@Override
	public void makesound() {
		System.out.println("Cat is Meowing");
	}

}
