package com.ruppyrup.polymorphism;

import java.util.HashMap;

public class PolyMorphExercise {
    public static void main(String[] args) {
        Vehicle porche = new Car("Porche", "911", 25);
        porche.start();
        porche.addFeature("bootsize", "500");
        var bootsize = porche.getFeature("bootsize");
        System.out.println(bootsize);
        Drivable p = () -> System.out.println("Hello from lambda");
        p.drive();
        p.start();

        Vehicle noddy = new ToyCar();
        noddy.model = "toy car";
        noddy.make = "noddy special";
        noddy.start();
        noddy.drive();

        VehicleHelper sound = (v) -> System.out.println(v.make + " goes brumm");

        sound.makeNoise(porche);
    }
}

@FunctionalInterface
interface Drivable {
    void drive();
    default void start() {
        System.out.println("Engin starting up");}
}

interface VehicleHelper{
    void makeNoise(Vehicle vehicle);
    static void register(Vehicle vehicle) {
        System.out.println(vehicle.make + " vin = " + vehicle.vin);
    }
}


abstract class Vehicle implements Drivable {
    protected String make;
    protected String model;
    protected int vin;

    private HashMap<String, String> features = new HashMap<>();

    public Vehicle(int vin) {
        this("No make", "No Model", vin);
    }

    public Vehicle(String make, String model, int vin) {
        this.make = make;
        this.model = model;
        this.vin = vin;
        VehicleHelper.register(this);
    }

    protected final void getMakeAndModel() {
        System.out.println(this.getClass().getSimpleName() + " : Make = " + make + ", Model = " + model);
    }

    public final int getVin() {
        return vin;
    }

    protected final String getFeature(String feature) {
       return features.get(feature);
    }

    protected final void addFeature(String feature, String value) {
        features.put(feature, value);
    }

}


class Car extends Vehicle {

    public Car(int vin) {
        super(vin);
    }

    public Car(String make, String model, int vin) {
        super(make, model, vin);
    }

    @Override
    public void drive() {

    }

    @Override
    public void start() {
        System.out.println("Starting the " + make + " " + model + " car.");
    }
}

class ToyCar extends Car {
    public ToyCar() {
        super(1);
    }

    @Override
    public void start() {
        System.out.println("Starting the toy car");
    }
}

class Truck extends Vehicle {

    public Truck(int vin) {
        super(vin);
    }

    public Truck(String make, String model, int vin) {
        super(make, model, vin);
    }

    @Override
    public void drive() {

    }

    @Override
    public void start() {
        System.out.println("Starting the truck");
    }
}