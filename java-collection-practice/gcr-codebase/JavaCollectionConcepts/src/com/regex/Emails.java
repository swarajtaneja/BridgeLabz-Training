package com.regex;
import java.util.regex.*;

public class Emails {
    public static void main(String[] args) {
        String s = "Contact us at support@example.com and info@company.org";
        Matcher m = Pattern.compile("[\\w.%+-]+@[\\w.-]+\\.[A-Za-z]{2,}").matcher(s);
        while (m.find()) System.out.println(m.group());
    }
}
