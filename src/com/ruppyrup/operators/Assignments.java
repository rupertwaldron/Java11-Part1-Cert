package com.ruppyrup.operators;

public class Assignments {
    public static void main(String[] args) {
        int a = 10; // assignment operator
        int bb = 1;
        if(20 == (bb = 20)) System.out.println("this is true");

        // for primitives the value is copied. Objects the reference is copied
        a /= 2; // a now equals 5 +=, %= etc are all compound assignment operators
        byte b1 = 8;
        b1 /= 2; // assigns 4 to b1. Expanced to b1 = (byte) (b1/2);
        // operators are right associative
        int b = 3;
        int c = 7;
        a = b = c = 10; // evaluated as a = (b = (c = 10))

        // bitwise operators
        byte b2 = 1;
        byte b3 = 2;
        byte b4 = (byte) (b2 & b3); //0
        byte b5 = (byte) (b2 | b3); //3
        byte b6 = (byte) ~b2; // -5
        byte b7 = (byte) (b3 << b3); //shifts to left = 4
        byte b8 = (byte) (b3 >> b2); //shifts to right = 1
        System.out.println(b8);
        var m1 = 2;
        var m2 = 4;
        var m = m2++ * 10 * --m1 + ++m2 - m1++;
        System.out.println(m);

        String s1 = "Hello" + 42;
        System.out.println(s1); // Hello42

        Assignments ass = null;
        System.out.println("Hello " + ass);

        String s3 = "Hello ";
        s3 += true;
        System.out.println(s3); // Hello true

        byte b9 = 1;
        short s = (short) (b9 + 2.0); // compiles after cast to short
        System.out.println(s);

        byte b10 = 127; // compiles fine because 127 just fits into byte
//        byte b10b = -b10;
        int i = 10;
//        byte b11 = i + 2; // wont compile because i could be larger than 10 at compile time
        final int I = 10;
        byte b12 = I + 2; // compiles because I is know and constant at compile time

        b12 *= b10; // b12 = 12, b10 = 20 compiles to byte even though the result wont fit result is -16
        System.out.println(b12);

        final Byte b13 = 10;
        //Byte b14 = -b13; // wont compile because the reference is final not the contents

    }
}
