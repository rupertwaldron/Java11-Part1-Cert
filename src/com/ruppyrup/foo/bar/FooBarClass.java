package com.ruppyrup.foo.bar;

import com.ruppyrup.foo.FooClass;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class FooBarClass {

    public static void main(String[] args) {
        fooBar();
        FooClass.foo();
        long arraycount = Arrays.stream(args).peek(System.out::println).count();
        System.out.println("Count of args is = " + arraycount);
    }

    public static void fooBar() {
        System.out.println("Hello from FooBar");
    }
}
