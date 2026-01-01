package com.bridgelabz.oops.inheritance.multilevelInheritance.educationalCourse;

public class Course {
	private String courseName;
	private int duration;
	public Course(String courseName,int duration) {
		this.courseName=courseName;
		this.duration=duration;
	}
	public void displayInfo() {
		System.out.println("Course Name : "+courseName);
		System.out.println("Course Duration : "+duration);
	}

}
