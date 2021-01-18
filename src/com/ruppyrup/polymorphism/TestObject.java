package com.ruppyrup.polymorphism;

public class TestObject {
    public void foo(Object object) {
        System.out.println(object);
    }
}

class Other {
    public void bar() {
        new TestObject().foo("Hello");
        new TestObject().foo(42);
    }

    public static void main(String[] args) {
        new Other().bar();
    }
}