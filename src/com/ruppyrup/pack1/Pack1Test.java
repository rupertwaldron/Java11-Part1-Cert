package com.ruppyrup.pack1;

import com.ruppyrup.pack2.Pack2Test;

public class Pack1Test {
    public String name = "Pack1Test Class";

    public static int age = 33;

    public static void main(String[] args) {
        System.out.println(Pack2Test.name);

        Pack2Test test = new Pack2Test();
        System.out.print(test.age);

        int count = 0;
        while (count < 10) {
            count++;
        }
    }
}
