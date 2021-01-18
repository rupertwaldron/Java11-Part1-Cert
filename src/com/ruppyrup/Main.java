package com.ruppyrup;


public class Main {

    public static void main(String[] args) {
        Person bob = new Person("Bob");
        System.out.println("Hello from the command line " + bob.getName());
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
