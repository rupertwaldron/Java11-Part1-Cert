package com.ruppyrup.decisions;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;

public class IfElse {
    public static void main(String[] args) {
        if (true) System.out.println("Is true");

        //or

        if (false) {
            System.out.println("Is false");
        } else if (true){
            System.out.println("Is true");
        } else {
            System.out.println("Never gets here");
        }

        if (true); // does nothing but is valid

        int i = 3;
        if (i == 0) // else is associated with closes if
        if (i == 1)
            System.out.println("b");
        else
            System.out.println("c");
        else
            System.out.println("d");

        if (i == 0) // this is how it should be laid out
            if (i == 1)
                System.out.println("b");
            else
                System.out.println("c");
        else
            System.out.println("d");

        boolean flag = false;
        if (flag = true) { // the value of the assignment is always to value assigned to the variable
            System.out.println(flag); // true
            if (flag = false) // evaluates to false
                System.out.println(flag);
            else
                System.out.println("false");
        }
        else
            System.out.println("false");

        int value = 8;
        if ((value = 2) == 2)
            System.out.println("Assignment gives 2");
    }
}
