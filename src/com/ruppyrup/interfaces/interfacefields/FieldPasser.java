package com.ruppyrup.interfaces.interfacefields;

public interface FieldPasser {
    String field = "trousers";

    static void test() {
        System.out.println("I need a body if I am static");
    }

    default void printField() {
        System.out.println(field);
    }
}
