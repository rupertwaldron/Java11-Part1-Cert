package com.ruppyrup.exceptions;

public class ExceptionsExercise {
    public static void main(String[] args) throws ContainsX {
        for (String arg : args) {
            int vowels = 0;
            try {
                vowels = ExceptionsExercise.countVowels(arg.toCharArray());
                System.out.println("Number of vowels in word " + arg + " = " + vowels);
            } catch (ContainsX containsX) {
                System.out.println("Word contains a x");
            }
        }
        System.out.println("Null check should equal -1 " + ExceptionsExercise.countVowels(null));
    }

    public static int countVowels(char[] chars) throws ContainsX {
        try {
            if (chars.length < 10) throw new CharArrayLessThan10("Array is less than 10");
            int vowelCount = 0;
            for (char c : chars) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') vowelCount++;
                if (c == 'x') throw new ContainsX("String contains a x");
            }
            return vowelCount;
        } catch (NullPointerException npe) { // deal with null passed as argument
            return -1; // return -1 for null pointer
        } catch (CharArrayLessThan10 calt) {
            return 0; // return 0 if char length is less than 10
        }
    }
}

class ContainsX extends Exception {
    public ContainsX(String message) {
        super(message);
    }
}

class CharArrayLessThan10 extends Exception {
    public CharArrayLessThan10(String message) {
        super(message);
    }
}