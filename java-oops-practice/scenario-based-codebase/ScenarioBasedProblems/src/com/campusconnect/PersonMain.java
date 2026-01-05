package com.campusconnect;

public class PersonMain {
    public static void main(String[] args) {

        Faculty f1 = new Faculty(101, "Dr. Sharma", "sharma@uni.edu", "Computer Science");
        Student s1 = new Student(1, "Aman", "aman@uni.edu");
        Student s2 = new Student(2, "Riya", "riya@uni.edu");

        Course javaCourse = new Course("Java Programming", f1);

        s1.enrollCourse(javaCourse);
        s2.enrollCourse(javaCourse);

        s1.addGrade(8);
        s1.addGrade(9);

        s2.addGrade(7);
        s2.addGrade(8);

        s1.printDetails();
        System.out.println();
        s2.printDetails();
        System.out.println();
        f1.printDetails();
        System.out.println();
        javaCourse.printCourseDetails();
    }
}
