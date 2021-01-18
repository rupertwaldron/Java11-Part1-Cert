package com.ruppyrup.arrays;

import java.util.Collection;
import java.util.Map;

public class MapTest {
    static Map<Integer, String> idName = Map.of(1, "Rupert", 2, "Nikki", 3, "Wendy"); // produces immutable map

    public static void main(String[] args) {
        System.out.println(idName.get(2)); // Nikki
        System.out.println(idName.getOrDefault(4, "Unknown")); // unknown
        idName.values().stream().map(String::toUpperCase).forEach(System.out::println); // prints uppercase list
        System.out.println(idName.remove(1)); // throws exception because immutable
    }
}

class Base {
    public void process(Collection c) {}
}

class SubClass extends Base {
    // overloads the Base class method
    public void process(Map<Integer, String> map) {
        super.process(map.keySet()); // this is fine
        process(map); // this is fine causes recursion
      //  super.process(map); // won't compile as super doesn't take a map
    }

    @Override
    public void process(Collection myList) {
        System.out.println("Hello");
    }
}