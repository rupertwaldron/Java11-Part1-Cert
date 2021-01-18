package com.ruppyrup.exceptions;

import java.io.IOException;
import java.sql.SQLException;

public class ExceptionMethods {
    int i = 5;

    {
        if (i==0) throw new Exception();
    }

    public ExceptionMethods(int i) throws Exception {
        this.i = i;
    }


    public static void main(String[] args) {

    }

    void bar(int x) {
        if (x == 2) throw new RuntimeException(); // don't need throws for Runtime exceptions or Errors
        else return;
    }

    void foo(int x) throws Exception {
        if (x == 2) throw new Exception(); // checked exceptions need the throws clause.
        else return;
    }

    void poo(int x) throws Exception {
        if (x == 2) throw new IOException(); // throws sub-exception, throws using superclass
        else return;
    }

//    void sar(int x) throws IOException {
//        if (x == 2) throw new Exception(); // won't compile as need to use superclass in throws not subclass
//        else return;
//    }

    void dar(int x) throws IOException, SQLException { // must list all exceptions or a common superclass exception
        if (x == 2) throw new IOException();
        else throw new SQLException();
    }

    void soo(int x) throws Exception, IOException{ // IOException is unnecessary because it is a subclass of exception
        if (x == 2) throw new IOException();
        else throw new SQLException();
    }

    void jar() throws Exception { // can specify an exception is thrown even if it isn't. Used if exception might be thrown in a futre impl
        System.out.println("I don't throw anything!");
    }

    void uoo(int x) { // only need throws if the exception is thrown out to the method caller
        try {
            if (x == 2) throw new Exception();
        } catch (Exception e) {
            System.out.println("Caught exception");
        }
    }

    void mar(int x) throws Exception { // needs throws as no catch block
        try {
            if (x == 2) throw new Exception();
        } finally { // exception can only be caught by a catch block not a finally block
            System.out.println("I haven't caught the exception");
        }
    }

    void tar() throws Throwable { // Throwable is the root of all exception classes
        if (true) throw new Exception();
    }
}
