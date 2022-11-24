package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static boolean isEmail(String input) {
        String regex = "^([a-zA-Z0-9_]+)@([a-zA-Z0-9_]+)([(\\.)([a-zA-Z0-9_])]+)([a-zA-Z])$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println(input + " является почтой");
            return true;
        } else {
            System.out.println(input + " не является почтой");
            return false;
        }
    }
    public static void main(String[] args) {
        String[] strings = {
                "user@example.com", "root@localhost",
                "myhost@@@com.ru", "@my.ru", "Julia String"};
        for (String s:
                strings) {
            isEmail(s);
        }
    }
}
