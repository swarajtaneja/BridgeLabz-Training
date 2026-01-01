package com.bridgelabz.oops.inheritance.employeeManagementSystem;

public class Intern extends Employee{
	public Intern(String name,int id,double salary) {
		super(name,id,salary);
	}
	@Override
	public void displayDetails() {
		System.out.println("Employee Post : Intern");
		super.displayDetails();
	}
}
