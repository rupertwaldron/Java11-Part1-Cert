package com.ruppyrup.methods;

public class StaticBlock {
    static int a;

    static {
        System.out.println(a); // this is valid as a is declared before the static block
        //System.out.println(b); // not valid as b is declared after teh static block
        b = 10; // valid because b is being assigned a value
        m(); // valid even though m is defined later
    }

    static void m() {
        System.out.println(b); // valid, a method can do anything with a variable that is declared later in the code
    }

    static int b;

    public static void main(String[] args) { }

    static {
        System.out.println(b); // valid as b is declared before
    }
}
