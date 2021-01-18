package com.ruppyrup.scope;

public class ScopeChecker {
    public static void main(String[] args) {
        System.out.println(ScopeTest.x); //13
        ScopeTest sc = new ScopeTest();
        System.out.println(sc.giveX()); //19
        ScopeTest.ST2 st2 = sc.new ST2();
        System.out.println(st2.x); //14
        System.out.println(st2.giveInnerX()); //34
    }
}
