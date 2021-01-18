package com.ruppyrup.inheritance;

public class A {
    static {
        System.out.println("In static A intializer");
    }

    A() {
        System.out.println("In A's constructor");
    }

    {
        System.out.println("In A's istance initializer");
    }
}

class B extends A {
    static {
        System.out.println("In static B intializer");
    }

    {
        System.out.println("In B's istance initializer");
    }

    B() {
        System.out.println("In B's constructor");
    }

    public static void main(String[] args) {
        System.out.println("In B's main");
        B b = new B();
        System.out.println("---------------------");
        B b1 = new B();
    }
}