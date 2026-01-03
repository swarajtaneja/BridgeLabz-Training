package com.universitycoursesystem;

public class PostGraduate extends Student {

    public PostGraduate(String studentId, String name) {
        super(studentId, name);
    }

    @Override
    public String getLevel() {
        return "Postgraduate";
    }
}
