package com.regex;
public class HexColor {
    public static void main(String[] args) {
        String s = "#ff4500";
        System.out.println(s.matches("^#[0-9A-Fa-f]{6}$"));
    }
}
