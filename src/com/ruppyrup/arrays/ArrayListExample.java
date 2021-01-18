package com.ruppyrup.arrays;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {


        ArrayList al = new ArrayList();
        ArrayList<String> list = new ArrayList<>(); // would normally use this rather than object
        al.add("alice");
        al.add("bob");
        al.add("chuck"); // [alice, bob, charlie]

        al.add(2, "david"); // [alice, bob, , david, charlie]
        al.remove(0); // [bob, , david, charlie]

        al.forEach(o -> {
            String name = (String) o;
            System.out.println(name + " " + name.length());
        });

        System.out.println("All names = " + al);

        ArrayList<String> bl = new ArrayList<>(); // would normally use this rather than object
        bl.add("alice");
        String s = bl.get(0); // valid no cast required
        Object obj = bl.get(0); // valid because a String is-a object
        //Integer in = bl.get(0); // invalid incompatible types

    }
}
