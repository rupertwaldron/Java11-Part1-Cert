package com.ruppyrup.inheritance;

public class Person {
    protected String name;

    public static int personCount;

    public Person(String name) {
        System.out.println("In Person's constructor");
        this.name = name;
    }

    public int getCount() {
        return personCount;
    }


}

