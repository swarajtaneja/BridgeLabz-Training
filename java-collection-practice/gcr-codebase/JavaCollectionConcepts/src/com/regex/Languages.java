package com.regex;
import java.util.regex.*;

public class Languages {
    public static void main(String[] args) {
        String s = "I love Java, Python, and JavaScript, but Go too.";
        Matcher m = Pattern.compile("\\b(Java|Python|JavaScript|Go)\\b").matcher(s);
        while (m.find()) System.out.println(m.group());
    }
}
