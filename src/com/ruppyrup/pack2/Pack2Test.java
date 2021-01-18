package com.ruppyrup.pack2;

import com.ruppyrup.pack1.Pack1Test;

public class Pack2Test {
    public static String name = "Pack2 Test";
    public int age = 66;

    public static void main(String[] args) {
        System.out.println(Pack1Test.age);

        Pack1Test test = new Pack1Test();
        System.out.println(test.name);
    }

}
