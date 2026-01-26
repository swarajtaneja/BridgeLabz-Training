package com.regex;
public class Censor {
    public static void main(String[] args) {
        String s = "This is a damn bad example with some stupid words.";
        System.out.println(s.replaceAll("\\b(damn|stupid)\\b", "****"));
    }
}
