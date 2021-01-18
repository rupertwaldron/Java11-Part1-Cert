package com.ruppyrup.arrays;

import java.util.Arrays;

public class ArraysExercise {
    public static void main(String[] args) {
        boolean[] boo1 = new boolean[3];
        for (boolean b : boo1) {
            System.out.println(b);
        }

        int[] first = new int[3]; // 0, 0, 0
        int[] second = {}; // nothing - empty list
        int[] third = null; // null pointer when try and print

        // change elements in a char array
        char[] chars = {'a', 'b', 'c', 'd'};
        for (int i = 0; i < chars.length - 1; i++) {
            chars[i] = chars[i+1];
        }

        // initialise an array with 4 elements of different length
        String[][] strings = {{"Bob", "Alice"}, {"Ted"}, {"a", "b", "c"}, {}};

        Arrays.stream(strings)
            .map(s -> s.length)
            .forEach(System.out::println);
        System.out.println(strings.length);

        String[][] names = {{"Bob", "Alice", "Carl"}, {"Darren", "Eddy", "Fred"}};
        print2DArray(names);

        // print the string array using for loop
        for (String[] name : names) {
            for (String s : name) {
                System.out.println(s);
            }
        }
        // initialise to String arrays using previous 2D array
        String[] name1 = names[0];
        String[] name2 = names[1];

        // create data array with field value and print out
        Data dinst = new Data(4);
        Data[] d = new Data[]{dinst, dinst, dinst};
        dinst.value = 5;
        Arrays.stream(d).map(data -> data.value).forEach(System.out::println);

        // create triangular array
        int[][] triArray = new int[4][4];
        for (int i = 0; i < triArray.length; i++) {
            for (int j = 0; j < i; j++) {
                triArray[i][j] = i + j;
            }
        }
        // create opposite triangle array
        int[][] triArray2 = new int[4][4];
        for (int i = 0; i < triArray2.length; i++) {
            for (int j = 0; j < i; j++) {
                triArray2[j][i] = triArray[i][j];
            }
        }

        print2DSquare(triArray);
        System.out.println("-----------");
        print2DSquare(triArray2);

        // initialise array of objects
        Object[] objects = {new int[]{1, 2, 3}, new int[][]{{1, 1, 1}, {2, 2, 2}}, new Object[3]};

        // address int array
        int[][] nums = new int[1][3]; // stores 3 values {{1,2,3}}

        // what does the following look like
        int[][][] n = new int[1][4][2];

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                for (int k = 0; k < n[i][j].length; k++) {
                    n[i][j][k] = i + j + k;
                    System.out.println("num["+ i+"]["+j+"]["+k+"] = "+n[i][j][k]);
                }
            }
        }

    }

    public static void print2DSquare(int[][] arr) {
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public static void print2DArray(int[][] arr) {
        Arrays.stream(arr)
            .flatMapToInt(Arrays::stream)
            .forEach(System.out::println);
    }

    public static void print2DArray(String[][] arr) {
        Arrays.stream(arr)
            .flatMap(Arrays::stream)
            .forEach(System.out::println);
    }

    public static void print1DArray(int[] arr) {
        Arrays.stream(arr)
            .forEach(System.out::println);
    }

    public static void print1DArray(char[] arr) {
        for (char c : arr) {
            System.out.println(c);
        }
    }

}
