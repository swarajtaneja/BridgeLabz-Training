package com.universitycoursesystem;

public class Faculty {

    private String facultyId;
    private String name;

    public Faculty(String facultyId, String name) {
        this.facultyId = facultyId;
        this.name = name;
    }

    public void gradeStudent(Graded enrollment, String grade) {
        enrollment.assignGrade(grade);
    }
}
