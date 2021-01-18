package com.ruppyrup.methods;

public class InterestCalc {
    static double rate;
    static {
        System.out.println("In the static block. Rate = " + rate); // run before main rate = 0.0
        rate = 10; // static block sets rate to 10
    }

    public static double computeInterest(double principle, int years) {
        return rate * principle * years / 100;
    }

    public static void main(String[] args) {
        double interest = computeInterest(100, 1);
        System.out.println(interest);
    }
}
