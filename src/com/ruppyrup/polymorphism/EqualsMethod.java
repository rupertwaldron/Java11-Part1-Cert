package com.ruppyrup.polymorphism;

public class EqualsMethod {

    public static void main(String[] args) {
        String s = "hello";
        Integer n = 10;
        //System.out.println(n == s); // wont compile
        Object s1 = "goodbye";
        System.out.println(n == s1); // will compile - false as Integer is-a object

    }
}

class X {
    int val;

    // Overloads as uses X
//    public boolean equals(X x) {
//        return this.val == x.val;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        X x = (X) o;

        return val == x.val;
    }

    @Override
    public int hashCode() {
        return val;
    }

    public static void main(String[] args) {
        X x1 = new X(); x1.val = 1;
        X x2 = new X(); x2.val = 1;
        System.out.println(x1.equals(x2)); // uses overloaded method in X -> true
        Object x3 = new X(); ((X) x3).val = 1;
        System.out.println(x1.equals(x3)); // uses equals method in Object as x3 is an object  -> false
    }
}


