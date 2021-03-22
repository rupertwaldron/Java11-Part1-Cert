package com.ruppyrup.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LatestList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // this is fine as ArrayList implements List
        var a1 = new ArrayList<Integer>(50); // initial capacity 50
        a1.add(null);
        a1.add(0, 3);
        final List<String> a = List.of("a", "b", "c");
//        a.add("d"); // unsupported operation exception

        ArrayList<String> a12 = new ArrayList<>(list); // copying list 0bserve the diamond operator
        System.out.println(a1);

        ArrayList<Integer> alist = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 3, 3, 2, 1));
        ArrayList<Integer> blist = new ArrayList<>(Arrays.asList(1, 2, 3));
        alist.removeAll(blist); //
        System.out.println(alist); // [4] as removeAll removes all the elements that match

        var a3 = new ArrayList<Integer>();
        //a3.add(1).add(2); // not allowed to chain methods

        ArrayList<String> a4 = new ArrayList<>();
        if (a4.add("a")) {
            if (a4.contains("a")) {
                a4.add(a4.indexOf("a"), "b");
            }
        }
        System.out.println(a4); // [b, a]

        a4.add(a4.size(), "x"); // adds on to end of array
        System.out.println(a4); // [b, a, x]

        ArrayList<String> a5 = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        a4.addAll(a5);
        a4.remove("b"); // removes first "b"
        System.out.println(a4); //[a, x, a, b, c, d]
        ArrayList<String> a6 = new ArrayList<>(Arrays.asList("a"));
        a4.removeAll(a6); // removes all "a" from list
        System.out.println(a4); // [x, b, c, d]

    }
}
