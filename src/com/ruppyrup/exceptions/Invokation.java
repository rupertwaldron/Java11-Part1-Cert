package com.ruppyrup.exceptions;

public class Invokation {
    public static void main(String[] args) throws Exception { // can use same exception type or higher
        throwException(); // if don't catch then need to declare in method signature
        try {
            throwException2(); // catch throwable as Exception is a subclass of Throwable
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    private static void throwException2() throws Throwable {
        if (Math.random() > 0.5) throw new Exception();
    }

    private static void throwException() throws Exception {
        if (Math.random() > 0.5) throw new Exception();
    }
}
