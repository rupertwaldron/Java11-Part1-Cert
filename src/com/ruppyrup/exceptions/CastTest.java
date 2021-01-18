package com.ruppyrup.exceptions;

public class CastTest {
    public static void main(String[] args) {
        Object s = "asdf";
        StringBuffer sb = (StringBuffer) s;
    }
}
