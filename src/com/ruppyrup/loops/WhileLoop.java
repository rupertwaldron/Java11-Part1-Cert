package com.ruppyrup.loops;

import java.util.HashSet;
import java.util.Iterator;

public class WhileLoop {

    public static void main(String[] args) {
        int i = 4;
        while (i > 0) { // condition checked before every iteration
            i--;
            System.out.println("i = " + i);
        }

        i = 4; // this loop does the same as above
        while (i-- > 0) System.out.println("i = " + i); // 3 -> 0
        System.out.println("i = " + i); // -1

        i = 4; // condition is checked at the end and always executed once
        do // don't need {} if just one line
            System.out.println("i = " + i); // 4 -> 0
        while (i-- > 0);
        System.out.println("i = " + i); // -1

        for (int j = 4; j > 0; j--) {
            System.out.println("j = " + j); // 4 -> 1
        }

        for (int j = 0; j < 10; System.out.println("j = " + j++)) {

        }
        //System.out.println("j = " + j); // error as j is scoped only for the loop
//        for(; ;) // legal and loops for ever
//            System.out.println("Forever loop");

//        for(int j = 8, k = 10; j < k; i++, k--) // can declare multiple vars but must be of same type
//            System.out.println("j = " + j + " k = " + k);
//
//
//        for(new ArrayList<>(); i < 4; i++) // instance creation
//            System.out.println();
//
//        for(int p = 0, String str = ""; i < 4; i++) // invalid as must be of same type
//            System.out.println();
//
//        for(System.out.println("method call"); i < 4; i++) // method call
//            System.out.println();

        //for(;;); // infinite loop

//        for (int j = 0; j < 10; callSomeMethod()) {
//        }
//
//        for (Type variableName : array_or_Iterable) {
//            statement;
//        }

        HashSet<Integer> s = new HashSet();
        s.add(2);
        s.add(3);
        Iterator<Integer> it = s.iterator();
        while (it.hasNext()) System.out.println(it.next());

        for (Integer num : s) {
            if (num == 2) continue; // exits the loop
            System.out.println(num);
        }

        String[][] groups = {
            {"ally", "bob", "charlie"},
            {"bob", "alice", "booe"},
            {"chad", "dave", "elliot"}
        };

        OUTER_LOOP: for (String[] group : groups) {
            for (String name : group) {
                System.out.println("Checking : " + name);
                if (name.equals("bob")) {
                    System.out.println("Found bob in group");
                    break OUTER_LOOP;
                }
            }
        }

        //
        HELLO: if (true) System.out.println("It's true"); // works ok

        SOME_LABEL: { // this works ok
            System.out.println("test1");
            System.out.println("test2");
        }

//        BAD1: int x = 0; // doens't work as not a statement
//        BAD2: x++; // doesn't work as not a statement'
//        BAD3: public void m1() {}; // can't apply labels to methods

        int a = 1;

        GOOD: a = 2;

        MYLABEL: {
            System.out.println("1 ");
            if (args != null) break MYLABEL; // can use labelled break, but not continue prints 1 3
            System.out.println("2 ");
        }
        System.out.printf("3 ");
        System.out.println("********************************");
        doIt(10);



    }

    public static void doIt(int h) {
        int x = 1;
        LOOP1: do {
            LOOP2:
            for (int j = 0; j < h; j++) {
                if (j == x) continue;
                if (x*x + j*j == h*h) {
                    System.out.println("Found " + x + " " + j);
                    break LOOP1;
                }
            }
            x++;
        } while (x < h);
    }

}
