package com.ruppyrup.methods;

public class Statics {
    final int value;

//    {
//        value = 10; // can initialise here
//    }

    public Statics() {
        value = 0; // or here
    }

    public Statics(int value) {
        this.value = value; // or here, can't be used with initializer but both
        // constructors can assign a value as only is used at creation
    }

    public static void main(String[] args) {
        var s = new Statics(10);
        System.out.println(s.value); // 10
    }
}
