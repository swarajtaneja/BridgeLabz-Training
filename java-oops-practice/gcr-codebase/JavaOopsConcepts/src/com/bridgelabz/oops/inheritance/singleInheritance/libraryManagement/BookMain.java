package com.bridgelabz.oops.inheritance.singleInheritance.libraryManagement;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book a1 = new Author("Atomic Habit", 2017, "David John", "Habits Change you");
		Book a2 = new Author("Businees Days", 2009, "Marcus", "All about business");
		
		a1.displayInfo();
		System.out.println();
		a2.displayInfo();

	}

}
