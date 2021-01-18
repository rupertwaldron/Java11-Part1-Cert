package com.ruppyrup.inheritance.abstr;

public class Home {

    protected int value = 100;

    public void sell() {
        System.out.println("Selling home for £" + value);
    }

    public void setValue(int value) {
        this.value = value;
    }
}

class House extends Home {
    public House() {
        super.value = 200;
    }
}


class TestHomes {
    public static void main(String[] args) {
        Home home = new Home();
        home.sell();
        Home house = new House();
        house.sell();
    }
}