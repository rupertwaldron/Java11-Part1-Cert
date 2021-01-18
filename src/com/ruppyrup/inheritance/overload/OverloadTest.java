package com.ruppyrup.inheritance.overload;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class OverloadTest {

}


class Base {
    public  <T extends Number, Z extends Number> Map<T, Z> getMap(T t, Z z)    {
        return new HashMap<T, Z>();
    }
}

class Derived extends Base {
    public  <T, Z> TreeMap<T, Z> getMap(T t, Z z) { return new TreeMap<T, Z>(); }
    @Override
    public  Map<Number, Number> getMap(Number t, Number z) { return new TreeMap<Number, Number>(); }
    //public  Map<Integer, Integer> getMap(Number t, Number z) { return new HashMap<Integer, Integer>();
// 3 }   Identify correct statements about the methods defined in Derived assuming they are uncommented one at a time individually.
}