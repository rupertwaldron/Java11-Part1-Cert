package com.ruppyrup.exceptions;

import java.io.CharConversionException;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MultiCatch {

    // assume that CharConversionException, FileNotFound and EOF all extend IOException

    void foo(int x) throws EOFException, CharConversionException, FileNotFoundException {
        if (x == 0) throw new CharConversionException();
        else if (x == 1) throw new FileNotFoundException();
        else throw new EOFException();
    }

    //OR

//    void foo(int x) throws IOException {
//        if (x == 0) throw new CharConversionException();
//        else if (x == 1) throw new FileNotFoundException();
//        else throw new EOFException();
//    }

    public static void main(String[] args) {
        MultiCatch test = new MultiCatch();
        try {
            test.foo(2);
        } catch (EOFException eofe) { // goes through exceptions in order, subclass goes at end otherwise
            System.out.println("End of file reached"); // there will be unreachable catch blocks
        } catch (CharConversionException cce) {
            System.out.println("Problem with file system");
        } catch (FileNotFoundException fnfe) {
            System.out.println("No such file");
        } catch (IOException e) { // will get a warning this is unreachalbe if individual exceptions are thrown from foo
            System.out.println("Unknown I/O Exception");
        } catch (Exception ex) { // foo may throw a runtime exception
            System.out.println("foo may throw a runtime exception so this is allowed.");
        }
    }

    void bar() throws EOFException {
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
