package com.ruppyrup.polymorphism;

public class TestSeeds {
    public static void main(String[] args) {
        Fruit1 banana = new Bananan();
        banana.consume();
    }

}

abstract class Fruit1 {
    protected int seeds = 10;

    protected void consume() {
        System.out.println(this.getClass().getSimpleName() + " has seeds = " + seeds);
    }
}

class Bananan extends Fruit1 {
//    {
//        seeds = 100;
//    }
}
