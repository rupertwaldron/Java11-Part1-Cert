package com.ruppyrup.variables;

public class TestClass {
    SomeClass someClass1 = new SomeClass();
    SomeClass someClass2 = someClass1, someClass3;

    public static void main(String[] args) {
        TestClass sc = new TestClass();
        System.out.println(sc.someClass1);
        System.out.println(sc.someClass2);
        System.out.println(sc.someClass3);
    }
}

class SomeClass {

}
