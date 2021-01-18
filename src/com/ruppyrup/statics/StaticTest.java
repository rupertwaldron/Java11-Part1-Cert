package com.ruppyrup.statics;


class Super {
    static String ID = "QBANK";
}

class Sub extends Super {
    static {
        System.out.print("In Sub"); // never gets run and no need
    }
}

public class StaticTest {
    public static void main(String[] args) {
        System.out.println(Sub.ID);
    }
}

