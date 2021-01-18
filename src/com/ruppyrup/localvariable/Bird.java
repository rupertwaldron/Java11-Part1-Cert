package com.ruppyrup.localvariable;

import java.util.LinkedList;
import java.util.List;

public class Bird {
    public int wings = 2;
    public float speed = 21F;
    public static int birds = 0;
    public boolean extinct = false;
    public double range = 100.3d;
    public String species;
    private static List<Bird> flock = new LinkedList<>();

    public Bird(String species) {
        this.species = species;
        Bird.birds++;
        flock.add(this);
        System.out.println(this.species + " constructed! Total birds = " + Bird.birds);
    }

    public Bird withSpeed(float speed) {
        this.speed = speed;
        return this;
    }

    public Bird withRange(double range) {
        this.range = range;
        return this;
    }

    public static int fly(String journey) {
        flock.forEach((bird) -> {
            var output = new StringBuilder(bird.species);
            output.append(" is flying at ");
            output.append(bird.speed);
            output.append(" with ");
            output.append(Bird.birds - 1);
            output.append(" other birds.");
            System.out.println(output);
            });
        return Integer.parseInt(journey);
    }
}
