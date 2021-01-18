package com.ruppyrup.init;

public class InitTest {
    public static void main(String[] args) {
        int i = 1_000_000; // underscores are valid
        Long l = 100L; // needs L on end
        char a = 'a'; // single quotes
        int k = 0xF; // Hex
        int m = 017; //Octal
        int n = 0b1111; // binary
        byte b = (byte) 128;
        byte d = 'a';
        int dd = 20;
        byte c = (byte) dd;
        System.out.println(i);
        System.out.println(l);
        System.out.println(a);
        System.out.println(k);
        System.out.println(m);
        System.out.println(n);
        System.out.println(b);
        System.out.println(d);
        System.out.println(c);
    }
}