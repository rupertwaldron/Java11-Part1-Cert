package com.ruppyrup.stringbuilder;

import com.ruppyrup.instantiate.Calculator;

public class StringBuiding {
    public static void main(String[] args) {
        // StringBuilder Constructors
        var a = new StringBuilder();
        var b = new StringBuilder(100);
        var c = new StringBuilder("Hello Rup");
        c.append(true); //Hello Ruptrue
        c.append(12.0); //Hello Ruptrue
        c.append(new Calculator()); //Hello Ruptrue12.0com.ruppyrup.instantiate.Calculator@48140564
        System.out.println(c);
        var d = new StringBuilder("abcdef");
        d.insert(2, 'C'); // abCcdef
        d.replace(1, 4, "z"); //azdef
        d.setLength(2); // az
        System.out.println(d);
        // diffence between delete and substring
        var sb = new StringBuilder("01234");
        String str = sb.substring(0, 2);
        System.out.println(str + ":" + sb); //01:01234
        StringBuilder sb1 = sb.delete(0, 2); // delete alters the original stringbuilder
        System.out.println(sb1 + ":" + sb); //234:234
    }
}
