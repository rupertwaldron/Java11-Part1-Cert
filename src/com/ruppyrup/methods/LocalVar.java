package com.ruppyrup.methods;

public class LocalVar {
    public static void main(String[] args) {
        final int x; // not initialized anywhere
        final int y;
        System.out.println("hello");
        y = 10; // can initialize y any time before it is used.
        System.out.println(y);
    }
}
