package com.bridgelabz.oops.inheritance.animal;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog1 = new Dog("Lily",4);
		Animal cat1 = new Cat("Sikandar",1);
		Animal bird1 = new Bird("Mukkadar",2);
		 
		dog1.makesound();//Dog is barking
		cat1.makesound();//Cat is meowing
		bird1.makesound();//Bird is Chirping

	}

}
