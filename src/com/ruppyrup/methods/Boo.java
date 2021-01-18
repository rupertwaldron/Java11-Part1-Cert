package com.ruppyrup.methods;

public class Boo {
   static int foo;
   static String baz;
}

class Test {
    public static void main(String[] args) {
        Boo.baz = "Hello"; // access static variables by the class name
        Boo b = null;
        System.out.println(b.foo); // would translate to Boo.foo as is static - called static binding
    }
}