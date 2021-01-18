package com.ruppyrup.methods;

public class Constructors {
    int val;

    {
        System.out.println("Testing constructors...");
    }

    public Constructors(int val) {
        this.val = val;
        System.out.println("In Constructor");
        Constructors();
    }

    void Constructors() {
        System.out.println("Not a constructor");
    }

    public static void main(String[] args) {
        new Constructors(8);
    }
}
