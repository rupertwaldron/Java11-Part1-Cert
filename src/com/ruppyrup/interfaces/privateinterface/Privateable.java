package com.ruppyrup.interfaces.privateinterface;

public interface Privateable {
    String teddy = "pubstaticString";
    String bob = "Bobby";
    default void defStatic() {
        System.out.println("Default static");
        sayHello();
    }

    private void sayHello() {
        System.out.println("Hello from private method" + bob);
    }
}


class Freddy implements Privateable {
    public static void main(String[] args) {
        Privateable bob = new Freddy();
        Freddy fred = new Freddy();
        bob.defStatic();
        fred.defStatic();
    }
}