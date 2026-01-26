package com.regex;
import java.util.regex.*;

public class Repeating {
    public static void main(String[] args) {
        String s = "This is is a repeated repeated word test.";
        Matcher m = Pattern.compile("\\b(\\w+)\\s+\\1\\b").matcher(s);
        while (m.find()) System.out.println(m.group(1));
    }
}
