package com.ruppyrup.exceptions;

import java.io.IOException;

public class ThrowTest {
    public static void main(String[] args) {
        var test = new ThrowTest();
        test.createBackupHandleException("input"); // already handles exception
        try {
            test.createBackupNotHandleException("input");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void createBackupHandleException(String input) {
        try {
            copyFile(input, "out");
            System.out.println("This wont run if there is an exception");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void createBackupNotHandleException(String input) throws IOException {
        copyFile(input, "out");
        System.out.println("backup successful");
    }

    public void copyFile(String input, String output) throws IOException {
        throw new IOException("Something bad happened");
    }

    public void copyFile2(String input, String output) throws IOException {
        throw new IllegalArgumentException("Something bad happened");
    }
}
