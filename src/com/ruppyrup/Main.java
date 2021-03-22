package com.ruppyrup;


import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Person bob = new Person("Bob");
        System.out.println("Hello from the command line " + bob.getName());

        IntStream.range(0, 100)
                .map(i -> repeatingSequence(i, 10))
                .forEach(System.out::println);

        System.out.println("*********************");

        final int ceiling = 10;

        Stream.iterate(0, i -> i % ceiling + 1)
                .limit(100)
                .forEach(System.out::println);
    }

    private static int repeatingSequence(int i, int ceiling) {
        return ((ceiling + i - 1) % ceiling) + 1;
    }

    private static class Person {
        String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
