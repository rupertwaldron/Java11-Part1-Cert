package com.ruppyrup.arrays;

import java.util.*;

public class ArrayQuiz {
    public static void main(String[] args) {
        String[] stringArray = {"hello", "I", "am", "here", "I", "hello"};

        List<String> strings = getList(stringArray); // returns a list of strings

        strings.set(0, "A");
        switchIt(strings, 0, 1);

        System.out.println(strings);

    }

    private static void switchIt(List<String> strings, int i, int j) {
        String temp = strings.get(i);
        strings.set(i, strings.get(j));
        strings.set(j, temp);
    }

    private static List<String> getList(String[] stringArray) {
        Set<String> bob = new HashSet<>(Arrays.asList(stringArray));
        System.out.println(bob);
        return new ArrayList<>(bob);
    }
}
