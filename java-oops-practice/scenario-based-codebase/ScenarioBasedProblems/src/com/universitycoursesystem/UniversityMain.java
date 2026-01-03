package com.universitycoursesystem;

public class UniversityMain {
    public static void main(String[] args) {

        Student ug = new UnderGraduate("S01", "Alice");
        Student pg = new PostGraduate("S02", "Bob");

        Course course = new Course("CS101", "OOP Concepts", 4);

        Enrollment e1 = new Enrollment(ug, course);
        Enrollment e2 = new Enrollment(pg, course);

        Faculty faculty = new Faculty("F01", "Dr. Smith");

        faculty.gradeStudent(e1, "A");
        faculty.gradeStudent(e2, "Pass");

        System.out.println("Alice GPA: " + ug.getTranscript());
        System.out.println("Bob GPA: " + pg.getTranscript());
    }
}
