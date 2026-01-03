package com.universitycoursesystem;

public class UnderGraduate extends Student {

    public UnderGraduate(String studentId, String name) {
        super(studentId, name);
    }

    @Override
    public String getLevel() {
        return "Undergraduate";
    }
}
