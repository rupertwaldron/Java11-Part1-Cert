package com.ruppyrup.methods;

public class Parent {
    static {
        System.out.println("Initialize the parent");
    }

    Parent() {
        System.out.println("Parent constructor");
    }
}

class ChildA extends Parent {
    static {
        System.out.println("Initialize ChildA");
    }
    ChildA() {
        System.out.println("ChildA constructor");
    }
}

class ChildB extends Parent {
    static {
        System.out.println("Initialize ChildB");
    }
    ChildB() {
        System.out.println("ChildB constructor");
    }
}

class TestChild {
    public static void main(String[] args) {
        var a = new ChildA();
        var b = new ChildB();
        // Initialize the parent
        // Initialize ChildA
        // Parent constructor
        // ChildA constructor
        // Initialize ChildB
        // Parent constructor
        // ChildB constructor
    }
}
