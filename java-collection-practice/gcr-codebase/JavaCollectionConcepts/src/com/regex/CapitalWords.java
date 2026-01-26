package com.regex;
import java.util.regex.*;

public class CapitalWords {
    public static void main(String[] args) {
        String s = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        Matcher m = Pattern.compile("\\b[A-Z][a-z]*\\b").matcher(s);
        while (m.find()) System.out.println(m.group());
    }
}
