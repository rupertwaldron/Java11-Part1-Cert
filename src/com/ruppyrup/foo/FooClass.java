package com.ruppyrup.foo;

import com.ruppyrup.foo.bar.*;

public class FooClass {

    public static void main(String[] args) {
        foo();
        FooBarClass.fooBar();
    }

    public static void foo() {
        System.out.println("Hello from Foo");
    }
}
