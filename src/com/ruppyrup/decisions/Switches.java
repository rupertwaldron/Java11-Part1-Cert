package com.ruppyrup.decisions;

public class Switches {
    public static void main(String[] args) {
        int i = 4;
        switch (i) {
            default:
                i += 3; // executed for any value other than 0, 1, 2
            case 2:
                i += 2; // exected for 2 and anything that falls into default
            case 4:
                i += 4;
            case 0:
                i -= 1;
                break; // just exected for i = 0; No default
            case 1: // just this is executed for i = 1. No default
                i++;
        }

        System.out.println(i);
        byte b = 10;
        switch (b + 1) {
            case 1000:
                System.out.println("Compiles because b + 1 gets promoted to int");
        }

        char ch = 0;
        int noOfVowels = 0;
        String str = "fkdlajfeiaijfmdafhuietykjbdkjaghfekarhhghealkerguibnka";
        char[] chars = str.toCharArray();
        for (char l: chars) {
            switch (l) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u': noOfVowels++;
            }
        }
        System.out.println("Number of char vowels = " + noOfVowels);
    }
}
