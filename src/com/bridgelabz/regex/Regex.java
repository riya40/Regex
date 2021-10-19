package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regex {

    public static void main(String[] args) {
        //checking the pattern for first name
        System.out.println("Printing the First Namae");
        Pattern pattern = Pattern.compile("^[A-Za-z]{3,6}$");
        Matcher matcher = pattern.matcher("Priya");
        if (matcher.find()) {
            System.out.println("Pattern matched");
        }
        else {
            System.out.println("Pattern not matched");
        }
        //checking the pattern for lasst name
        System.out.println("Printing the last name");
        Pattern pattern1 = Pattern.compile("^[A-Za-z]{3,6}$");
        Matcher matcher1 = pattern.matcher("Nunna");
        if (matcher.find()) {
            System.out.println("Pattern matched");
        }
        else {
            System.out.println("Pattern not matched");
        }

    }
}
