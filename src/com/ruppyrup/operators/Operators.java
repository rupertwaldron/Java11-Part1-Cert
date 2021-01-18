package com.ruppyrup.operators;

public class Operators {
    public static void main(String[] args) {
        int a = 3;
        Integer b = 10; // uses primitive wrapper
        int c = a + b; // 13
        int d = b % a; // 1
        char e = 'a'; // value 97
        System.out.println("a = " + e);
        System.out.println(b%e); // 10
        int f = -10; // assigns -10 to f
        int g = -f; // 10
        int h = +f; // -10
        --h; // -11
        h--; // -11 then to -12
        System.out.println(h); // -12
        a++; // 3 -> 4
        boolean b1 = 10 < 100; // true <= >= >
        int a1 = 97;
        char b2 = 'a';
        System.out.println(b2 == a1); // true as 'a' is 97 in dec
        // == and != can be applied to all primitive types
        Object o1 = new Object();
        Object o2 = o1;
        System.out.println(o1 == o2); // true compares the reference object
        o2 = new Object();
        System.out.println(o1 == o2); // false compares the reference object
        boolean boo1 = true;
        boolean boo2 = false;
        boolean boo3 = boo1 && boo2; // false
        boo3 = boo1 || boo2; // true
        // logical expressions on the left are always evaluated first
        boo3 = boo1 & boo2; // similar to above but evaluate both expressions unlike &&
        boo3 = boo1 | boo2; // true
        System.out.println(boo3);
        boo3 = false ^ false; // true if one of operands is true
        System.out.println(boo3);
        int s = 5;
        String str = a == 5 ? "five" : "not five"; // ternary operator
    }
}
