package com.regex;
public class Spaces {
    public static void main(String[] args) {
        String s = "This   is    an example   ";
        System.out.println(s.replaceAll("\\s+", " "));
    }
}
