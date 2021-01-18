package com.ruppyrup.polymorphism;

import java.awt.*;

public class Shape {
    public static void main(String[] args) {
        Square square = new Square();
        Circle circle = new Circle();
        Shape s1 = square; // this is ok because square and circle are Shapes
        Shape s2 = circle; // this is ok

        //square = circle; // wont compile as circle is not a square

        //circle = s2; // wont compile because s1 and s1 even though they are the correct type
        //square = s1; // compiler can't confirm these will be the correct type at compile-time.
        // compilation could lead to a violation of type-safety

        // solve the above with the cast operator
        circle = (Circle) s2; // works as is cast - downcasting
        square = (Square) s2; // can also cast a circle Shape to a Square - but get ClassCastException at runtime
        s1 = circle; // upcasting - no casting checks required.

        Circle circle1 = new Circle();
        //Square square1 = (Square) circle1; // the compiler won't allow this as circle can never be a sqaure at runtime.

        // interfaces are treated differently to classes
        Shape s3 = new Square();
        Broken b1 = (Broken) s3; // compiles but throws a classcastexception at runtime. The compiler knows Shape
        // doesn't implement Broken, but a sub-class could implement Broken so it lets it compile
        // not this would not compile if Shape as a final class as the compiler would know it doesn't have any subclasses

        Shape s4 = new Triangle();
        Broken b2 = (Broken) s4; // compiles and runs fine
    }
}

class Square extends Shape { }
class Circle extends Shape { }
class Triangle extends Shape implements Broken {}
interface Broken {}