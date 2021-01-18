package com.ruppyrup.inheritance;

public class SubCalculate extends Calculate{
    @Override
    protected int calculate(int a, int b) {
        return a - b;
    }
}
