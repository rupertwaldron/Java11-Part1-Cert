package com.ruppyrup.overriding;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StaticOverride {
    public static void main(String[] args) {
        ArrayList<String> als = new ArrayList<>(List.of("a", "b", "c"));
        Set<String> ss = new HashSet();
        ss.addAll(als); //1
        als.clear();    //2
        System.out.println(ss.size());
        var hello_world = "hello".concat(" world").trim().equals("hello world");
        System.out.println(hello_world);
    }

}


