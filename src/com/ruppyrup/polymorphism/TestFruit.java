package com.ruppyrup.polymorphism;



class Fruit {
    public int seeds = 5;
}

class Mango extends Fruit {
    public void removeSeed() {
        seeds = 0;
        System.out.println("Removing seed");
    }
}

class Juicer {
    // would normally use polymorphism for this
   public static void crush(Fruit fruit) {
       if(fruit instanceof Mango) { // check type of fruit
           ((Mango) fruit).removeSeed(); // only mango has the removeseed() method
       }
       System.out.println("Crushing fruit");
   }
}

public class TestFruit {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        Mango mango = new Mango();
        mango.seeds = 1;
        System.out.println(mango.seeds); //1
        System.out.println(fruit.seeds); //5
        Juicer.crush(mango);
        System.out.println(mango.seeds); //0
    }
}