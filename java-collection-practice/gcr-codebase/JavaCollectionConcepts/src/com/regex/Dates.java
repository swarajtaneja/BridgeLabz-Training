package com.regex;
import java.util.regex.*;

public class Dates {
    public static void main(String[] args) {
        String s = "Dates: 12/05/2023, 15/08/2024, 29/02/2020";
        Matcher m = Pattern.compile("\\b\\d{2}/\\d{2}/\\d{4}\\b").matcher(s);
        while (m.find()) System.out.println(m.group());
    }
}
