package com.ruppyrup.exceptions;

public class ComputeException {
    public static void main(String[] args) {
        System.out.println(processException());
    }

    public static String processException() {
        double interest = 0.0;
        try {
            computeInterest(100, 0.1, -1);
            return "Success";
        } catch (IllegalArgumentException e) {
            return "Found Arg exception";
        } catch (Exception ex) {
            return "Found Exception";
        }
        finally {
            return "This is the end"; // just prints this
        }
    }

    public static double computeInterest(double p, double r, int t) throws IllegalArgumentException {
        if (t < 0) throw new IllegalArgumentException("t must be > 0");
        else return p * r * t;
    }
}
