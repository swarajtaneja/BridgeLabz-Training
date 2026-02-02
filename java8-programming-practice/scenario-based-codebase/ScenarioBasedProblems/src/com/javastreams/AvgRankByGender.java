package com.javastreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

public class AvgRankByGender {
	public static void main(String[] args) {
		List<Student> student = List.of(new Student("Swaraj Kumar",111,"Swaraj",22,"M","Katni",1,"6203565963"),
				   new Student("daku maharaj",98,"daku",22,"M","Bhopal",2,"8334897238"),
				   new Student("Shriyansh",83,"Shriyansh",21,"M","Sagar",3,"8334897435"),
				   new Student("xyz iad",78,"xyzd",26,"F","hfjksh",53,"83348972332"),
				   new Student("jhs hjs", 67,"jhs",38,"F","hskf",49,"8334897254"));
		
		Map<Object, Double>avgRank =student.stream()
				.collect(Collectors.groupingBy(s->s.gender,Collectors.averagingInt(s->s.rank)));
		
		avgRank.forEach((gender,rank)-> System.out.println(gender+" -> "+rank));
		
	}
}
