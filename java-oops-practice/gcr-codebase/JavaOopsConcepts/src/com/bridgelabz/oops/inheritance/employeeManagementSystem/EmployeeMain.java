package com.bridgelabz.oops.inheritance.employeeManagementSystem;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee m1 = new Manager("Vedansh",101,60000,4);
		Employee d1 = new Developer("Himesh",102,40000,"JAVA");
		Employee i1 = new Intern("Chanda",103,25000);
		
		
		m1.displayDetails();
		System.out.println();
		d1.displayDetails();
		System.out.println();
		i1.displayDetails();
	}

}
