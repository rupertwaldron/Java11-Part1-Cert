package com.ruppyrup.generics;

import java.util.Arrays;
import java.util.List;

public class BuildingTest {

    public static void main(String[] args) {

        BuildingTest bt = new BuildingTest();

        Building b1 = new Building();
        Building b2 = new Building();
        Building h1 = new House();

        House h2 = new House();
        House h3 = new House();

        List<Building> buildings = Arrays.asList(b1, b2, h1);

        List<House> houses = Arrays.asList(h2, h3);

        bt.paintAllBuildings(buildings);

        bt.paintAllBuildings(houses);


    }

    void paintAllBuildings(List<? extends Building> buildings) {
        buildings.forEach(Building::paint);
    }
}

class Building {
    protected void paint() {
        System.out.println("Painting " + this.getClass().getSimpleName());
    }
}

class House extends Building {

}