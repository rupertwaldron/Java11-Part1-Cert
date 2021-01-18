package com.ruppyrup.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodExercise {

    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3, 4, 5));
        System.out.println(sum((char)1, (char)2, (char)3, (char)4, (char)5));
        Student student1 = new Student();
        Student student2 = new Student();
        System.out.println("No of students = " + Student.studentCount);
        var test = new MethodExercise();
        test.method2(student1);
        test.method1(student1);
        test.method2(student1);

        Course maths = new Course();
        maths.enroll(student2);
        maths.enroll(student1);
        System.out.println(maths);
    }


    private static int sum(int... ints) {
        return Arrays.stream(ints).sum();
    }

    private static String sum(char... chars) { // create a different method signature for sum
        StringBuilder s = new StringBuilder();
        for (int achar : chars) {
            s.append(achar);
        }
        return s.toString();
    }

    private void method1(Student student) {
        Student.studentCount--;
        student.id = 10L;
        student.name = student.name + " Again";
        student.address = "holiday home";
    }

    private void method2(Student student) {
        System.out.println(new Student());
    }
}

class Student {
    static int studentCount;
    Long id;
    String name;
    String address;
    Course course;

    public Student() {
        this(15L, "Rup", "Wokingham");
        studentCount++;
    }

    public Student(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.address = "home";
        student.id = 1L;
        student.name = "Bob";
        System.out.println(student);
    }

    @Override
    public String toString() {
        return "Student{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", address='" + address + '\'' +
            '}';
    }
}

class Course {
    private static List<Student> students = new ArrayList<>();

    public void enroll(Student student) {
        student.course = this;
        students.add(student);
    }

    @Override
    public String toString() {
        return students.toString();
    }
}
