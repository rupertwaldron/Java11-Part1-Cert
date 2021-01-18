package com.ruppyrup.exceptions;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReThrows {

    void bar2() throws EOFException {
        try {
            foo();
        } finally {
            System.out.println("not dealing with exception which is thrown after this code is executed");
        }
    }


    void bar() throws IOException {
        try {
            foo();
        } catch(EOFException eofe) {
            throw new Exception(); // exceptions from try/catch are ignored if the finally block throws an exception
        } finally {
            throw new IOException();
        }
    }

    void foo() throws EOFException {
        try {
            if (true) throw new FileNotFoundException();
            else throw new EOFException(); // this is not caught by the nested catch below
        } catch (FileNotFoundException fnfe) {
            try {
                throw new EOFException();
            } catch (EOFException eofe) {
                eofe.printStackTrace();
            }
        }
    }
}
