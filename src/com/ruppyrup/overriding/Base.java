package com.ruppyrup.overriding;

import java.util.ArrayList;
import java.util.Set;

class Base{
    public ArrayList<Number> transform(Set<Integer> list){
        return new ArrayList<>();
    }
}

class Derived extends Base{
    public ArrayList transform(Set list){
       return new ArrayList<>();
    }
}
