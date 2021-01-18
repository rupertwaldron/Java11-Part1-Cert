package com.ruppyrup.inheritance;

public class Calculate {
    protected int calculate(int a, int b) {
        return a + b;
    }

    void superClassMethodNotOverridden() {
        System.out.println("Can be accessed by sub-sub-class");
    }
}
