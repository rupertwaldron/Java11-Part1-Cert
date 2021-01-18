package com.ruppyrup.instantiate;

import java.util.Date;

/**
 * Java Doc comment
 */
public class Student {
    private static int count = 0;
    private String studentId;

    static { // static initializer
        System.out.println("Student class loaded");
    }

    { // instance initializer
        System.out.println("Student count = " + ++Student.count);
    }

    public Student(String studentId) { // constructor
        this.studentId = studentId;
        System.out.println(new Date() + " Student created. Total Students = " + count);
    }

    @Override
    public String toString() { // instance method
        return "Student{" +
            "studentId='" + studentId + '\'' +
            '}';
    }

    public static void main(String[] args) { // static method
        Student s1 = new Student("A1234");
        Student s2 = new Student("A1235");

        System.out.println("Students: " + s1 + s2);
    }
}




