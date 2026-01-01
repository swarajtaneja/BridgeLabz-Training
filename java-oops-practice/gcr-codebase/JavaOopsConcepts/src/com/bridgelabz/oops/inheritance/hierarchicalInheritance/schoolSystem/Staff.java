package com.bridgelabz.oops.inheritance.hierarchicalInheritance.schoolSystem;

public class Staff extends Person{
	
	public Staff(String name, int age) {
		super(name, age);
	}
	
	public void displayRole() {
		super.details();
		System.out.println("Role: Staff");
	}
}