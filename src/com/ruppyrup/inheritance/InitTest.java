package com.ruppyrup.inheritance;

public class InitTest {
    private String testName = "Bob";
    private String same;

    public InitTest() {
        System.out.println(testName);
        same = "hello";
        System.out.println(same);
    }

}

class Test {
    public static void main(String[] args) {
        new InitTest();
    }
}
