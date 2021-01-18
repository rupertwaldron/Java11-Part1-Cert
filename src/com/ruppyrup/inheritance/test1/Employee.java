package com.ruppyrup.inheritance.test1;

import com.ruppyrup.inheritance.Person;

public class Employee extends Person {
    protected String empId;
    public Employee() {
        this("dummy", "0000");
        System.out.println("In Employee() constructor");
    }

    public Employee(String name, String empId) {
        super(name);
        this.empId = empId;
        this.name = "Sally";
        System.out.println("In Employee(String, String) constructor");
    }
}

class Manager extends Employee {
    String grade;
    Manager(String grade) {
        System.out.println("In Manager(String) constructor");
        this.grade = grade;
    }

    public static void main(String[] args) {
        var manager = new Manager("A");
        manager.empId = "0001";
        manager.name = "Terry";
        System.out.println(manager.name + " " + manager.empId + " " + manager.grade);
    }
}


class TestManager {
    public static void main(String[] args) {
        var manager = new Manager("10");
        var employee = new Employee();
        employee.empId = "67";
        manager.empId = "15";
        //employee.name = "bob"; // can't access
        //manager.name = "sue"; // can't access
    }
}