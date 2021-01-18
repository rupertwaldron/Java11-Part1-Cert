package com.ruppyrup.lambdas;

import java.util.Arrays;
import java.util.function.Supplier;

public class LambdaTest {
    public static void main(String[] args) {
       Shape shape = () -> 100;
       System.out.println(shape.computeArea());

       Operation operation = ((String name, double[] params) -> {
           Arrays.stream(params).map(p -> p * p).forEach(pa -> System.out.println(pa + name));
       });

       operation.operate("Rupert", new double[]{1.0, 2.4, 4.8});
    }
}

@FunctionalInterface
interface Shape {
    double computeArea();
}

@FunctionalInterface
interface Operation {
    void operate(String name, double[] params);
}