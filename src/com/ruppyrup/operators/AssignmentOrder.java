package com.ruppyrup.operators;

import com.sun.security.jgss.GSSUtil;

public class AssignmentOrder {
    static boolean a; // initally false
    static boolean b; // initally false
    static boolean c; // initally false

    public static void main(String[] args) {
        boolean bool = (a = true) || (b = true) && (c = true);
        System.out.println(a + ", " + b + ", " + c); // true, false, false
        // || will only evaluate the left side of the expression. If true it wont do the other side
        // change || to | and both sides will be evaluated.

        String s1 = "7" + 5 + 10; //7510
        s1 = 7 + 5 + "10"; //1210
        s1 = "7" + (5 + 10); //1210
        System.out.println(s1);

        int m = 50; // m = 50;
        int n = ++m; // n = 51, m = 51;
        int o = m--; // o = 51, m = 50
        int p = --o+m--; // p = 100, o = 50, m = 49
        System.out.println("m = " + m + ", o = " + o + ", p = " + p);
        int x = m<n?n<o?o<p?p:o:n:m;
        System.out.println(x); // 51 or n

        int k = 4;
        boolean flag = k++ == 5; // false
        flag = !flag; // true
        System.out.println(flag);

        byte b = 1;
        //b = b << 1; // wont compile
        int c = b << 1; // c = 2
        //byte d += b; // fail as d has no value
        byte e = 0;
        e += b; // e = 1
        System.out.println(c + ", " + e);

        String s = "a";
        String[] sa = {"a", s, s.substring(0, 1), new String("a"), "" + 'a'};
        for (int i = 0; i < sa.length; i++) {
            System.out.print(i);
            System.out.print(s == sa[i]);
            System.out.println(s.equals(sa[i]));
        }


    }
}
