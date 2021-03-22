package com.ruppyrup.polymorphism;

public class Shadow {
    public static void main(String[] args) {
        House house = new House();
        DetachedHouse detachedHouse = new DetachedHouse();

        System.out.println(house.rooms); // 4
        System.out.println(detachedHouse.rooms); // 6
        System.out.println(((House)detachedHouse).rooms); //4
        house.printRoom(); // 4
        detachedHouse.printRoom(); // 4
    }

}

class House {
   static int rooms = 4;

    void printRoom() {
        System.out.println(rooms);
    }
}

class DetachedHouse extends House {
    static int rooms = 6;
}
