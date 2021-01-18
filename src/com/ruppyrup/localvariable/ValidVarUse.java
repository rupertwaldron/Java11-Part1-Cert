package com.ruppyrup.localvariable;

import java.util.LinkedHashMap;

public class ValidVarUse {
    public static void main(String[] args) {
        var i = 10; // type of i is int
        var f = 1.0f; // type of f is float
        var strA = new String[]{"a", "b"}; // strA is type String[]
        var d = Math.random(); // d is type double
        Object obj = "hello";
        var obj2 = obj; // obj2 and obj are of type Object

        for(var str : strA) {
            var p = str; // type p becomes String
        }

        switch(strA[0]) {
            case "a":
                var m = new Object(); // m is type Object
        }

        LinkedHashMap<String, Double> testMap = new LinkedHashMap<>();
        var testMap1 = new LinkedHashMap<String, Double>();
    }
}
