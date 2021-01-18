package com.ruppyrup.garbage;

public class GC {
    Object instanceVar;

    public GC(Object instanceVar) {
        this.instanceVar = instanceVar;
    }

    public static void main(String[] args) {
        Object tempVar = new Object(); // tempVar refs Object1
        var gc = new GC(tempVar); // gc.instanceVar refs Object1
        tempVar = new Object(); // tempVar not refs Object2
        gc = null; // gc can't be referenced so can be garbage collected
        // Object1 is still refs by gc.instanceVar but this can no longer be accessed so is garbage collected.

        String str = "hello";
        for (int i = 0; i < 5; i++) {
            str = str + i;
            // str and i are new strings every loop so 11 strings are created in total
            // + could also be created into a string at runtime
            // the compiler might also use stringBuilder too.
        }
    }

}
