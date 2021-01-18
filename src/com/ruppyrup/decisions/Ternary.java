package com.ruppyrup.decisions;

public class Ternary {

    public static void main(String[] args) {
        boolean b = false;
        boolean c = (b = true) ? false : true; // false
        System.out.println(c);

        // must have all operands and must return a value of boolean, numeric or reference
        int d = !c ? 5 : 6;
        int e = b ? (int) 10.0 : 2; // can't do this as double can't be converted to int must use cast

        int x = 0;
        int y = 1;
        System.out.println(x > y ? ++x : y++); // 1 as y++ is evaluated
        System.out.println(x + " " + y); // 0 2
    }

}
