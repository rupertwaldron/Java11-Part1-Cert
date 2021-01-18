package com.ruppyrup.inheritance.overload;

public class Foo {
    protected Overloadable getName() {
        return new Overloadable() {
        };
    }
}

class Bar extends Foo {
    @Override
    public Overloadable getName() {
        return new Overloadable() {
        };
    }
}

class Python extends Foo {
    @Override
    public Fred getName() {
        return new Fred() {
        };
    }
}


interface Overloadable {}

class Fred implements Overloadable {}