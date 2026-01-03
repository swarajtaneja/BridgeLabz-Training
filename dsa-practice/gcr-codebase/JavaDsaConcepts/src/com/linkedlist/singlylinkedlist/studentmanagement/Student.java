package com.linkedlist.singlylinkedlist.studentmanagement;

public class Student {
	public String rollNumber;
	public String name;
	public int age;
	public char grade;
	public Student next;
	
	public Student(String rollNumber,String name,int age, char grade) {
		this.rollNumber=rollNumber;
		this.name=name;
		this.age=age;
		this.grade=grade;
		this.next=null;
	}

}
