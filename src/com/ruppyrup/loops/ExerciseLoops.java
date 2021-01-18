package com.ruppyrup.loops;

import java.util.Arrays;
import java.util.function.Consumer;

public class ExerciseLoops {
    public static void main(String[] args) {
        int[][] triang = new int[10][10];
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                triang[i][j] = i + j;
//                System.out.println(i + ", " + j + " = " + triang[i][j]);
//            }
//        }

//        int n = 0;
//        int m = 0;
//        while (n < 10) {
//            while (m < 10) {
//                triang[n][m] = n + m;
//                System.out.println(n + ", " + m + " = " + triang[n][m]);
//                m++;
//            }
//            m = 0;
//            n++;
//        }

//        System.out.println(isPrime(13));
//        System.out.println(isPrime(21));
//        System.out.println(isPrime(7));
//
//        printPrimes(100);


        int[] _1D1 = new int[]{1, 2, 3};
        int[][] _2D1 = new int[][]{_1D1}; // first column is filled
        int[][] _2D2 = new int[][]{_1D1, _1D1}; // first 2 columns are filled
        int[][][] _3D = new int[][][]{_2D1, _2D2};

        for (int i = 0; i < 2; i++) {
            //System.out.println("1D1 " + _1D1[i]);
            for (int j = 0; j < 1; j++) {
                //System.out.println("2D2 " + _2D2[i][j]);
                for (int k = 0; k < 3; k++) {
                    System.out.println("3D " + _3D[i][j][k]);
                }
            }
        }

        Consumer<String> countSpaces = (str) -> {
            char[] chars = str.toCharArray();
            int count = 0;
            for (char c : chars) {
                if (c == 'x') break;
                if (c == ' ') count++;
            }
            System.out.println("White space until x = " + count);
        };

        countSpaces.accept("This is the test string except that is it!");


        String[][] chars = new String[2][];
        chars[0] = new String[2];
        chars[1] = new String[4];
        char cha = 97;
        for (int c = 0; c < chars.length; c++) {
            for (int ch = 0; ch < chars[c].length; ch++) {
                chars[c][ch] = "" + cha;
                cha++;
            }
        }
        System.out.println("Chars = " + Arrays.deepToString(chars));
//        for (String[] chara : chars) {
//            for (String s : chara) {
//                s = "" + cha++;
//            }
//        }
        System.out.println(chars);

        int[] numberArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < numberArray.length; i += 2) {
            System.out.println(numberArray[i]); // print alternate elements of array
        }
        int[] newArray = new int[10];
        for (int i = numberArray.length - 1; i >= 0; i--) {
            System.out.println(numberArray[i]); // print reverse array
            newArray[numberArray.length -1 - i] = numberArray[i];
        }

        for (int i : newArray) {
            System.out.println(i);
        }

    }

    public static void printPrimes(int n) {
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) System.out.println(i);
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
