package com.ruppyrup.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class ForEachTest {

    public static void main(String[] args) {
        BiConsumer<String, Integer> biConsumer = (s, i) -> System.out.println(s + " is mapped to " + i);
        Map<String, Integer> myMap =  Map.of("One", 1, "Two", 2);
        myMap.forEach(biConsumer);

        List<String> games = new ArrayList<String>(List.of("football", "cricket", "baseball", "tennis"));
        int x = 6;
        games.stream().filter(game -> game.length() > x).forEach(System.out::println); // compiles ok if x isn't changed afterwards
        //x = 8; // above will not compile as x has now changed, ok if no change

    }
}
