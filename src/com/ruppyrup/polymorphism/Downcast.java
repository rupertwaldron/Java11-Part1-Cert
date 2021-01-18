package com.ruppyrup.polymorphism;

public class Downcast {
    public static void main(String[] args) {
        Object object = "hello";
        int h = object.hashCode(); // compiles because object has this method
        //int i = object.length(); // wont compile because the compiler doesn't know object is a string a runtime
        String str = "hello";
        int j = str.length(); // compiles because compiler knows j is a string
        int k = ((String) object).length(); // this works fine now because we have downcast object. Note object is still an Object
        String string = (String) object; // object is still Object, string is now a String
    }
}
