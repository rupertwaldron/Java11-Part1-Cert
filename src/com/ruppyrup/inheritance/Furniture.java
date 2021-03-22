package com.ruppyrup.inheritance;

public abstract class Furniture {
    private String material;

    static final void getCountry() {
        System.out.println("Country is England");
    }

    public Furniture() {
        System.out.println("Furniture is created");
    }

    String getMaterial() {
        return material;
    }

    //private abstract void recline(); // compiler error -> subclasses can't inherit a private thing

    void setMaterial(String material) {
        this.material = material;
    }

    abstract void assemble();

//    abstract static boo(); // wont compile as static methods can never be over ridden

    final void printManufacturer() { // can't  be overridden
        System.out.println("Rupert's made this furniture");
    }

    private void thisYearsColor() { // a private method doesn't need to be final as it can't be inherited
        System.out.println("This year's colour is Orange");
    }
}

final class Chair extends Furniture {
    // Chair is final so it can't be subclassed so must implement assemble()
        @Override
        void assemble() {
        System.out.println(this.getClass().getSimpleName() + " is made of " + getMaterial());
    }

//    static void getCountry() {
//        System.out.println("Country is Germany"); // can't "hide" this static method as it is final in Furniture class
//    }
}

final class Table extends Furniture {
    // Table is final so it can't be subclassed so must implement assemble()
    @Override
    void assemble() {
        System.out.println(this.getClass().getSimpleName() + " is made of " + getMaterial());
    }

//    @Override
//    private void thisYearsColor() { // can't access this method as it is private in superclass
//
//    }
}

class TestFurniture {

    private static void make(Furniture furniture) {
        furniture.assemble();
    }

    public static void main(String[] args) {
        Furniture table = new Table();
        Furniture chair = new Chair();
        chair.setMaterial("Rubber"); // material is held in the superclass instance of chair and table
        table.setMaterial("Hair"); // can't access material directly as it is private, only through getter and setter
        make(table); // Table is made of Hair
        make(chair); // Table is made of Rubber
        chair.printManufacturer(); // Can't override this method
//        table.thisYearsColor(); // Won't compile as subclasses can't access private methods

        Chair testChair = new Chair();
        testChair.getCountry();
    }
}