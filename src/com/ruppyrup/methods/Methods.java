package com.ruppyrup.methods;

public class Methods {

    static int add(int a, final int b) throws Exception {
        // b = 10;
        if (a > b) return a + b; // compiler says missing return type unless you add line below
        else throw new Exception("Hello");
    }


//    void doSomething() {
//        System.out.println("hello");
//        return void; // this is invalid
//        return; // this is valid
//        // No return is normally used.
//    }

    int wrapper1() {
        return new Integer(10);
    }

    Integer wrapper2() {
        return 10;
    }

    Object getValue() {
        return "Hello"; // this compiles because String is an object
    }

//    String getString() {
//        return new Object(); // this will not compile because Object is not a String
//    }

    class Name {
        String firstName, secondName;
    }

    Name getName() {
        Name name = new Name();
        name.firstName = "Rupert";
        name.secondName = "Waldron";
        return name;
    }

    String[] getNames() {
        //return {"Rupert", "Waldron"}; // not allowed
        return new String[]{"Rupert", "Waldron"};
    }

    public static void main(String[] args) throws Exception {
        processData(10L); // compiler error
        System.out.println(Methods.add(5, 4));

        String me = (String) getString();
        System.out.println(me);
    }

    static void processData(Long... values) {
        System.out.println("Long vargs");
    }
    static void processData(Long value) {
        System.out.println("autoboxing");
    }

    static Object getString() {
        return "Object";
    }

    static String getObject() {
        return (String) new Object();
    }




}
