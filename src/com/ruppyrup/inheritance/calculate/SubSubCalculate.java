package com.ruppyrup.inheritance.calculate;

import com.ruppyrup.inheritance.SubCalculate;

public class SubSubCalculate extends SubCalculate {
    @Override
    protected int calculate(int a, int b) {
        return a * b;
    }

    public void testCalc(int i, int j) {
        int a = super.calculate(i, j); // 12 can acess instance and static methods by using super
        int b = this.calculate(i, j); // 160
        int c = calculate(i, j); // 160
        //int d = super.super.calculate(i, j); // does not compile a subclass can only access it's immediate super class
        System.out.println("Super = " + a);
        System.out.println("this = " + b);
        System.out.println("nothing = " + c);
        //superClassMethodNotOverridden(); can't access from different package
    }

    public static void main(String[] args) {
        var sum = new SubSubCalculate();
        var a = 20;
        var b = 8;
        sum.testCalc(a, b);
       // sum.superClassMethodNotOverridden();
    }
}
