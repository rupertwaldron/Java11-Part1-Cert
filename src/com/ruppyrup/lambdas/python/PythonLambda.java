package com.ruppyrup.lambdas.python;

import java.util.function.IntBinaryOperator;

public class PythonLambda {

    static IntBinaryOperator sum = Integer::sum;

    static void runlambda(IntBinaryOperator calculate, int x, int y) {
        System.out.println(calculate.applyAsInt(x, y));
    }

    public static void main(String[] args) {
        runlambda(sum, 4, 7);
        runlambda((a, b) -> a * b, 4, 7);
    }


}
