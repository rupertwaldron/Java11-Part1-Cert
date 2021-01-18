package com.ruppyrup.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class GenericTest {
    public static void ConsumeData(DataHolder<String> stringData) { // here we are "typing" dataholder to String
        String s = stringData.getData(); // no cast is required to do this
        //Integer i = stringData.getData(); // error - incompatible types - compiler knowns this wont work - type safety
        int[][] a = {{1, 3}, {2, 4}};
        var b = new int[][]{{1, 3}, {2, 4}};
    }

    public static void main(String[] args) {
        List<String> a1 = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));
        List<String> a2 = a1.subList(2, 4);
        System.out.println(a2); // [c, d]
        a2.add("x");
        System.out.println(a2); // [c, d, x]
        System.out.println(a1); // [a, b, c, d, x, e] a1 is modified if you modify the sublist
        a1.add("y"); // structural modification to the original list
        System.out.println(a2); // throws java.util.ConcurrentModifcationException
    }


}

// Data holder is a Parameterized class
class DataHolder<E> { // tells compiler E is just a placeholder and will be replaced by an actual type later on
    E data;

    //Object data - would allow lots of different types and no type safety.
    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }
}

class RRGeneric {
    public <T, R> R funcy(T input) {
        return (R) input;
    }
}

class Coin {
}

class ListProcecessor {
    public <T> List<T> process(List<T> listOfT) {
        return listOfT;
    }
}

class failList extends ListProcecessor {
    @Override
    public <String> List<String> process(List<String> listOfT) {
        return listOfT;
    }
}

class SubList extends ListProcecessor {
    @Override
    public <Coin> List<Coin> process(List<Coin> listOfT) { // correct overload as have different parameter types
        ArrayList bob = new ArrayList<>();
        Collection ted = new ArrayList();
        return listOfT;
    }
}

class TestOverRide extends ListProcecessor {
    @Override
    public <Object> List<Object> process(List<Object> list123) {
        return new ArrayList<Object>();
    }

    public static void main(String[] args) {
        TestOverRide test = new TestOverRide();
        test.process(new ArrayList<Integer>());
    }
}

class SuperBuilding {
    public static void paint(Object object) {

    }
}


class Building extends  SuperBuilding {
    public static void paintAllBuildings(List<? super Building> buildings) {
        buildings.forEach(SuperBuilding::paint);
    }
}




