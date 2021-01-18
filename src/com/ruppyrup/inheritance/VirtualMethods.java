package com.ruppyrup.inheritance;

import java.util.ArrayList;
import java.util.List;

public class VirtualMethods {
    protected static int frend;
    static public void main(String[] args) {
        A1 x = new B1();
        B1 y = new B1();
        B1 z = new C1();

        ((B1) x).mB();

        //float bob = 1e0;
        int k = 2;
        k += k-- - --k;
        System.out.println(k);
        k = 0 % 2;
        System.out.println(k);
        List<String> s = new ArrayList<>(List.of("A","B"));
        String[] strings = s.toArray(new String[1]);
        var p = List.copyOf(s);
        //p.set(1, "C");

        for (int i = 0; i < 5; i++, System.out.println(i)) {

        }
    }
}

class A1 {
    public void mA() {
    }
}

class B1 extends A1 {
    public void mA() {
    }

    public void mB() {
    }
}

class C1 extends B1 {
    public void mC() {
    }
}



