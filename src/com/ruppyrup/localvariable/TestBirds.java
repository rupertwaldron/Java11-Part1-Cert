package com.ruppyrup.localvariable;

public class TestBirds {
    Bird robin = new Bird("Robin");

    public static void main(String[] args) {
        var starling = new Bird("Starling");
        var blackBird = new Bird("Black Bird");

        blackBird
            .withRange(150)
            .withSpeed(27);

        starling
            .withRange(200)
            .withSpeed(35);

        var testBirds = new TestBirds();  // Robin is constructed here

        System.out.println(starling.fly("1333"));


    }
}
