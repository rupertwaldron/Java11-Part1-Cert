package com.ruppyrup.interfaces.interfacefields;

public class FindFields implements SubFieldPasser {

    public FindFields() {
        this.printAllFields();
    }

    public static void main(String[] args) {
        FieldPasser fp = new FindFields();
        System.out.println(FieldPasser.field);
        FieldPasser.test();
        //SubFieldPasser.field = "Hello";// field is final
    }

}