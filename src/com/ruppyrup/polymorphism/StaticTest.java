package com.ruppyrup.polymorphism;

public class StaticTest {
    public static void main(String[] args) {
        Foo foo = new Foo();
        System.out.println(foo.ted); //0
        Bar bar = new Bar();
        System.out.println(bar.getTed()); // 4
    }
}

class Foo {
    public final int ted = 0;
    static void foo() {}

    void moo() { }

    private void bob() {}

    final void alice() {}
}

class Bar extends Foo {
    int ted = 2; // can have this and can change the value as different to superclass ted

    public int getTed() {
        //super.ted = 3; // can't do this as final in Foo
        ted = 4; // can do this as Bar ted
        return ted;
    }

//    void foo() {} // can't override static method
//    static void moo() {} // can't override instance method
//    private void bob() {} // method is not overriden as can't see superclass method
//    final void alice() {}; // can't override as alice is final in superclass.
}