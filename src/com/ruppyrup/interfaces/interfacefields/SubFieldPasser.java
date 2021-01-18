package com.ruppyrup.interfaces.interfacefields;

public interface SubFieldPasser extends FieldPasser {
    String subField = "shirt";

    default void printAllFields() {
        System.out.println(field);
        System.out.println(subField);
    }
}
