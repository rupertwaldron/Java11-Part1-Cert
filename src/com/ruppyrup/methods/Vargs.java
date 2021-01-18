package com.ruppyrup.methods;

public class Vargs {

    public static void main(String[] args) {
        double avg = average(1, 3, 5, 8, 2, 9);
        System.out.println(avg); // prints 4.6667
        System.out.println(average()); // prints NaN
        System.out.println(average(null)); // Null pointer exception
    }

    public static double average(int... args) {
        double sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        return sum / args.length;
    }
}
