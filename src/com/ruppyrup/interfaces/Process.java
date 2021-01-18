package com.ruppyrup.interfaces;


interface Task {
    int SIZE = 10;
    default void doIt() {
        System.out.println("Doing task");
    }
}

interface Activity {
    long SIZE = 20;
    void doIt();
}

public class Process implements Task, Activity { // will not compile unless implement the method
    public void doIt() { // must have weaker access privealages.
        System.out.println("Proces doing it");
    }

    public static void main(String[] args) {
        System.out.println(Activity.SIZE * Task.SIZE); // need to specify which SIZE to use
    }
}
