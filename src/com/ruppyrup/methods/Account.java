package com.ruppyrup.methods;

public class Account {
    int id;
    String name;

    public Account() {
        id = 111;
        name = "dummy";
    }

    public Account(String name) {
        this();
        this.name = name;
    }

    public Account(String name, int id) {
        this(name);
        this.id = id;
    }

    public void reset() { // None of this will reset and call the constructor
//        this();
//        Account();
//        this = new Account();
//        new Account();
    }

    public static void main(String[] args) {
        Account a = new Account("amy", 3);
        a.reset();
        System.out.println(a.id + ", " + a.name);
    }
}
