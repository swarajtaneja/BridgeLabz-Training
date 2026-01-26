package com.regex;
import java.util.regex.*;

public class Currency {
    public static void main(String[] args) {
        String s = "The price is $45.99 and discount 10.50";
        Matcher m = Pattern.compile("\\$?\\d+\\.\\d{2}").matcher(s);
        while (m.find()) System.out.println(m.group());
    }
}
