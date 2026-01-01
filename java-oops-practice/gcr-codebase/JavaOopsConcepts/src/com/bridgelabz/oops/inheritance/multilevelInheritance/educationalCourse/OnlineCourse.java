package com.bridgelabz.oops.inheritance.multilevelInheritance.educationalCourse;

public class OnlineCourse extends Course {
	private String platform;
	private boolean isRecorded;
	public OnlineCourse(String courseName,int duration,String platform,boolean isRecorded) {
		super(courseName,duration);
		this.platform=platform;
		this.isRecorded=isRecorded;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Course Platform : "+platform);
		System.out.println("Course is reorded ? :"+(isRecorded == true ? "Yes" : "No"));
	}

}
