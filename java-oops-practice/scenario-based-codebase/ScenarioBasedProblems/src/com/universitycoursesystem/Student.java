package com.universitycoursesystem;

public abstract class Student {

    protected String studentId;
    protected String name;
    private double gpa;   // Encapsulated

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = 0.0;
    }

    public Student(String studentId, String name, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = gpa;
    }

    protected void updateGPA(double newGpa) {
        this.gpa = newGpa;
    }

    public double getTranscript() {
        return gpa;
    }

    public abstract String getLevel();
}
