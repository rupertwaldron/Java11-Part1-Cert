package com.ruppyrup.methods;


import static com.ruppyrup.methods.Constants.COMPOUNDING;

public class InstanceCounter {
    static int count;
    int marker;

    public InstanceCounter() {
        count++; // access from constructor
    }

    static void printCount() {
        //marker++; // not allowed as marker can't be accessed from a static context as this isn't available.
        System.out.println(count); // access from static method
        InstanceCounter ic = new InstanceCounter();
        System.out.println(ic.marker); // this is allowed as marker is referenced to an instance
    }

    void reduceCount() {
        marker++; // is is fine as this is implicit
        this.marker--; // this is explicit
        count--; // access from instance method
    }
}

class TestClass {
    public static void main(String[] args) {
        InstanceCounter ic = new InstanceCounter();
        ic.printCount(); //1 access static method via an instance

        new InstanceCounter().printCount(); //2 accessing static method through an implicit reference to an instance

        ic.reduceCount(); // non-static method access via instance

        InstanceCounter.printCount(); //1  access via the class

        System.out.println(COMPOUNDING);
    }
}
