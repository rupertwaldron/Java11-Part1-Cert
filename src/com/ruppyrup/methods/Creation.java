package com.ruppyrup.methods;

public class Creation {
//    {
//        throw new RuntimeException(); // fails
//    }


    int i = 20;

    {
        System.out.println(i);
        i = 10;
        System.out.println(i);
    }

    public static void main(String[] args) {
        Creation c = new Creation();
        System.out.println("Main method");
    }
    {
        System.out.println(i);
    }
}
