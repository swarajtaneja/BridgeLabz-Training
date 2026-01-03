package com.universitycoursesystem;

public class Enrollment implements Graded {

    private Student student;
    private Course course;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    @Override
    public void assignGrade(String grade) {

        if (student instanceof UnderGraduate) {
            double gradePoint = 0;

            switch (grade) {
                case "A": gradePoint = 4.0; break;
                case "B": gradePoint = 3.0; break;
                case "C": gradePoint = 2.0; break;
                default: gradePoint = 0.0;
            }

            double gpa = gradePoint / 1; // Operator usage
            student.updateGPA(gpa);
        }

        else if (student instanceof PostGraduate) {
            if (grade.equalsIgnoreCase("Pass")) {
                student.updateGPA(4.0);
            } else {
                student.updateGPA(0.0);
            }
        }
    }
}
