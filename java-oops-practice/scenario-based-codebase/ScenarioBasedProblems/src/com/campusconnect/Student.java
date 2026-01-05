package com.campusconnect;

import java.util.ArrayList;

public class Student extends Person implements ICourseActions {

    private ArrayList<Integer> grades;   // private as required
    private ArrayList<Course> courses;

    public Student(int id, String name, String email) {
        super(id, name, email);
        grades = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    // Operator usage for GPA calculation
    public double calculateGPA() {
        if (grades.isEmpty()) return 0.0;

        int sum = 0;
        for (int g : grades) {
            sum += g;     // + operator
        }
        return (double) sum / grades.size(); // / operator
    }

    @Override
    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    @Override
    public void dropCourse(Course course) {
        courses.remove(course);
        course.removeStudent(this);
    }

    @Override
    public void printDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("GPA: " + calculateGPA());
    }
}
