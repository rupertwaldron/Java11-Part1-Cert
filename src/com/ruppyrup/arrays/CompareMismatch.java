package com.ruppyrup.arrays;

import java.util.Arrays;

public class CompareMismatch {
    public static void main(String[] args) {
        int[] a = { 'h', 'e'};
        int[] b = { 'h', 'e', 'l', 'l', 'o'};

        int x = Arrays.compare(a, b);
        int y = Arrays.mismatch(a, b);
        System.out.println(x+" "+y); // -3 2
    }
}
