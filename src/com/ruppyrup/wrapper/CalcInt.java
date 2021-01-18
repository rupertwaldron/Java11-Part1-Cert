package com.ruppyrup.wrapper;

public class CalcInt {

    public static void main(String[] args) {
        RRInteger test = RRInteger.asRRInt(5);
        RRInteger test2 = RRInteger.asRRInt("5");

        Character c = 'c'; // this is autoboxing
        // otherwise you had to write
        Character d = new Character('d');
        Character e = Character.valueOf('e');
        System.out.println(c);

        Integer.valueOf("6"); // more efficient than constructor as can retrun cached object.

        //These refer to the same object
        Integer i1 = 100;
        Integer i2 = 100;

        System.out.println(i1.intValue()); //convert to primitive

        Integer i3 = 10; // autoboxing
        int i4 = i3; // unboxing
    }
}
