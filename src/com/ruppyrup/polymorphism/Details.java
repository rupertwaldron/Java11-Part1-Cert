package com.ruppyrup.polymorphism;

public class Details {
    public static void main(String[] args) {
        System.out.println(new Derived().getName());
        //System.out.println(new Derived().name);

        Base b1 = new Derived();
        System.out.println(b1.getName());
        System.out.println(b1.name);
        System.out.println(((Derived) b1).name);
        System.out.println(((Base) b1).getName());

    }
}

class Base {
    public String name = "Base";
    public String getName() {
        return name;
    }
}
class Derived extends Base {
    public final String name = "Derived";
    public String getName() {
        return name;
    }
}