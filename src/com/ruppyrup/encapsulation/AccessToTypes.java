package com.ruppyrup.encapsulation;

public class AccessToTypes { // can be public or default
    private class Inner1 {}; // inner classes can be private
    protected class Inner2 {}; // protected
    public class Inner3{}; // public
    class Inner4 {}; // default
}

interface Fly {
    void flying(); // this method is public
    private String makeFly() {return "Can fly";} // private methods must have a body
    int birdCount = 10; // fields are always public
}

enum Day { // can only be public or default
    WEEKDAY, // always public unless otherwise specified
    HOLIDAY;

    Day() { // constructors are always private.
    }

    private int value; // enum field can be public, private or protected

    public void count() { // enum method can be public, private or protected
    }
}