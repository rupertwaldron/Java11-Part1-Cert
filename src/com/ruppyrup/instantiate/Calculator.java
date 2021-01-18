package com.ruppyrup.instantiate;

import java.util.Arrays;

public class Calculator {
    public int calculate(int[] array) {
        return Arrays.stream(array).sum();
    }


    public static void main(String[] args) {
        int result = new Calculator().calculate(new int[]{1, 2, 3, 4, 5});
        System.out.println(result);
    }

}
