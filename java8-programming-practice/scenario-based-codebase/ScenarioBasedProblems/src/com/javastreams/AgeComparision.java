package com.javastreams;
import java.util.*;

public class AgeComparision {
	public static void ageGreaterThan25(Student[] arr) {
		
		Arrays.stream(arr).filter(student -> student.age>25).forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		
		Student[] ages = { new Student("Swaraj Kumar",111,"Swaraj",22,"M","Katni",1,"6203565963"),
						   new Student("daku maharaj",98,"daku",22,"M","Bhopal",2,"8334897238"),
						   new Student("Shriyansh",83,"Shriyansh",21,"M","Sagar",3,"8334897435"),
						   new Student("xyz iad",78,"xyzd",26,"F","hfjksh",53,"83348972332"),
						   new Student("jhs hjs", 67,"jhs",38,"F","hskf",49,"8334897254")};
		
		ageGreaterThan25(ages);
	}
}
