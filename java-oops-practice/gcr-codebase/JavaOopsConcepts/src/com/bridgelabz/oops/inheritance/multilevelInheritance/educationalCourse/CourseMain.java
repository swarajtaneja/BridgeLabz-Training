package com.bridgelabz.oops.inheritance.multilevelInheritance.educationalCourse;

public class CourseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course course = new Course("Java Basics", 30);
		course.displayInfo();
		System.out.println();
		OnlineCourse online = new OnlineCourse("Web Development",45,"Coursera",true);
		online.displayInfo();
		System.out.println();
		PaidOnlineCourse paid = new PaidOnlineCourse("Full Stack Development",60,"Udemy",true,4999,20);
		paid.displayInfo();

	}

}
