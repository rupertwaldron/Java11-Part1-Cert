package com.ruppyrup.strings;

public class StringEquals {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        int int1 = 1234;
        String str3 = "1234";
        String str4 = "" + int1;

        System.out.println(str1 == str2);
        System.out.println(str3 == str4);

    }
}
