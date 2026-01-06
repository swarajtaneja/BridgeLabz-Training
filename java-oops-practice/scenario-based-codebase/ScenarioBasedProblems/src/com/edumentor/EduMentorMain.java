package com.edumentor;

import java.util.*;


public class EduMentorMain {
    public static void main(String[] args) {

        Learner learner = new Learner(
                "Swaraj",
                "swaraj@edumentor.com",
                103,
                "SHORT"
        );

        Quiz quiz = new Quiz("EASY");

        List<String> userAnswers = new ArrayList<>();
        userAnswers.add("4");

        double result = quiz.evaluate(userAnswers);
        System.out.println("Quiz Score: " + result + "%");

        learner.generateCertificates();
    }
}