package com.ruppyrup.exceptions;

public class Fruit {
    public Fruit() throws Exception {
        if (Math.random()>0.5) throw new Exception();
    }

    public Fruit(int calories) {
    }
}

class Apple extends Fruit {

    public Apple() throws Exception {
    }

    // or

//    public Apple() {
//        this(100);
//    }

    public Apple(int calories) {
        super(calories);
    }
}