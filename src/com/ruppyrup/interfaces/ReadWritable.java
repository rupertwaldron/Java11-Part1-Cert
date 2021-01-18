package com.ruppyrup.interfaces;

interface Reading {
    int SIZE = 10; // static

    static void staticMethod() { // not inherited
        System.out.println("In writing static method");
    }

    default void defaultMethod() {
        System.out.println("In reading default method");
    }

    void read();
}


interface Writing {
    int SIZE = 20; //static

    static void staticMethod() { // not inherited
        System.out.println("In reading static method");
    }

    default void defaultMethod() {
        System.out.println("In writing default method");
    }

    default void defaultMethod1() {
        System.out.println("In writing default method");
    }

    void write();
}


public interface ReadWritable extends Reading, Writing {
    int NEWSIZE = Reading.SIZE; // size must be used unambigously

    // inherits SIZE and read() from Reading
    // inherites SIZE and write() from Writing
    // static methods are not inherited and so there is no issue - can access static methods through their interface
    // there are two defaultMethod() so ReadWritable must provide it's own implementation

    default void defaultMethod() {
        System.out.println("In readwritable default method");
        int a = Reading.SIZE;
        Writing.staticMethod();

    }

    void delete();

}

class TestReadWritable implements ReadWritable {
    @Override
    public void read() {
        this.defaultMethod1();
        Reading.staticMethod();
        this.defaultMethod();
    }

    @Override
    public void write() {

    }

    @Override
    public void delete() {

    }
}

interface Dummy {
}

class TestClass {
    public static void main(String[] args) {
        Dummy d = new Dummy() { }; // anonymous class
    }

    @Override
    public String toString() {
        return "TestClass{}";
    }
}

abstract class Animal {
    public static void main(String[] args) {
        Animal a = new Animal() { }; // anonymous class
    }
}
