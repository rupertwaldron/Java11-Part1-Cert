package com.ruppyrup.interfaces;


public class first implements Moveable, Readable {

    @Override
    public void move() {
        System.out.println("Moving...");
    }

    @Override
    public void read() {
        System.out.println("Reading...");
    }
}

interface Moveable {
    void move(); // normal abstract method
    public static final int bob = 10;
    public static enum Test {
        TDD,
        BDD
    }
}

interface Readable {
    void read();
}

interface Printable {
    static void print(){
        System.out.println("In Printable.print()");
    }
    static void test() {
        System.out.println("In static test");
    }
}

class Price {
    static void move() {
        System.out.println("Price is moving ");
    }
}

class StockPrice extends Price implements Printable {
    static void print(){
        System.out.println("In StockPRice.print()");
    }

    public static void main(String[] args) {
        StockPrice stockPrice = new StockPrice();
        stockPrice.move();
        Printable.test();
        StockPrice.move(); // static method from Price
        StockPrice.print(); // can't call an interfaces static method from the class - this uses StockPrice Static
        // which hides the Printable version
        //StockPrice.test(); //can/t call this method
        Printable.print(); // can call print from the interface
        System.out.println(Moveable.Test.BDD);
    }
}