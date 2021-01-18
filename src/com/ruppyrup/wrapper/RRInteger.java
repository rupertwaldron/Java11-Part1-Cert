package com.ruppyrup.wrapper;

public class RRInteger {
    private int anInt;

    private RRInteger(int anInt) {
        this.anInt = anInt;
    }

    public static RRInteger asRRInt(int anInt) {
        return new RRInteger(anInt);
    }

    public static RRInteger asRRInt(String str) {
        return new RRInteger(Integer.parseInt(str));
    }

    public int intValue() {
        return anInt;
    }
}
