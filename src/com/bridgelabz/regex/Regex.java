package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regex {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[A-Za-z]{3,6}$");
        Matcher matcher = pattern.matcher("Priya");
        if (matcher.find())
            System.out.println("Pattern matched");
        else
            System.out.println("Pattern not matched");

    }
}
