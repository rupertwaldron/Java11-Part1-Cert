package com.ruppyrup.arrays;

import com.ruppyrup.foo.FooClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayTest {
    int[] ints; // ints is a 1D array
    int i, aints1[]; // i is an int and aints1 is a 1D array
    int[] ia, iaa[]; // ia is a 1D array and iaa is a 2D array

    int[] ib = new int[10]; // array of ints of size 10 - primitive values default to zero
    Object[] aob = new Object[5]; // array of 5 objects - references default to null
    boolean[] aboo = new boolean[2]; // array of 2 booleans - booleans defaul to false
    // missing the size will not compile
    // parts on the right above are called "Array Creation Expressions"

    public static void main(String[] args) {
        int[] ai = new int[10]; //[I : java.lang.Object
        boolean[] ab = new boolean[2]; //[Z : java.lang.Object
        String[] str1 = new String[3]; //[Ljava.lang.String; : java.lang.Object
        FooClass[] fc1 = new FooClass[4]; //[Lcom.ruppyrup.foo.FooClass; : java.lang.Object

        System.out.println(ai.getClass().getName() + " : " + ai.getClass().getSuperclass().getName());
        System.out.println(ab.getClass().getName() + " : " + ab.getClass().getSuperclass().getName());
        System.out.println(str1.getClass().getName() + " : " + str1.getClass().getSuperclass().getName());
        System.out.println(fc1.getClass().getName() + " : " + fc1.getClass().getSuperclass().getName());

        int[] ai1 = {1, 3, 4};
        boolean[] ab1 = {false, true, true};
        String[] str2 = {"a", "b", "c"};
        FooClass[] fc2 = {new FooClass(), new FooClass(), new FooClass()};

        int[] ai1Clone = ai1.clone();
        for (int i : ai1Clone) {
            System.out.println(i);
        }

//        String[] sa = {"1", "2", "3"};
//        Object[] oa = sa;
//        oa[0] = new Object(); // will only fail at runtime

        Number[] na = {1, 2, 3,};
        na[0] = new Float(1.2f); // Number is superclass of Float

        int[] ca1 = {0, 1, 2, 4};
        int[] ca2 = {0, 1, 2, 3};
        int[] ca3 = {0, 1, 4, 2};
        System.out.println(Arrays.compare(ca1, ca2)); // -1
        System.out.println(Arrays.compare(ca1, ca3)); // -1
        System.out.println(Arrays.mismatch(ca1, ca2)); //3 is first mismatch
        System.out.println(Arrays.mismatch(ca1, ca3)); // 2 is first mismatch

        Arrays.equals(ca1, 0, 3, ca3, 0, 3);


        int[][] iaa = new int[2][3]; // array of length 2 which contains 3 element arrays. Elements set to 0
        // Array creation without 2nd size is ok as the first array is storing 2 references.
        int[][] ibb = new int[2][]; // all elements are null as this is array of Objects;
        //int[][] icc = new int[][2]; // this is invalid as you need to set the higher dimension.
        ibb[0] = new int[2]; // now set to 0
        ibb[1] = new int[3]; // now set to 0

        int[][] idd = new int[][]{new int[]{1,2}}; // one element in an array, that element contains array of 1 and 2
        int[][] iee = {{1, 2}}; // same as above

        int[] intArray = new int[]{0, 1, 2};
        Object object = intArray; // valid because an array is an object
        //Object[] objects = intArray; // not valid because intArray contains ints not Objects
        Object[] oa = new int[2][]; // valid because it is an array of array object
        //Object[][] oaa = new int[2][]; // not valid because it will reference ints not objects.

        System.out.println("*******");
        for (int[] ints : idd) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }

        Data dinst = new Data(4);
        Data[] d = new Data[]{dinst, dinst, dinst};
        dinst.value = 5;
        Arrays.stream(d).map(data -> data.value).forEach(System.out::println);
    }

}
