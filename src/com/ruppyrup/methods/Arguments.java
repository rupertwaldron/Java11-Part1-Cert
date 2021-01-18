package com.ruppyrup.methods;

public class Arguments {
    public static void main(String[] args) {
       modifyData(new Data()); // reference isn't return so value is lost

    }

    static void modifyData(Data d) {
        d.value *= 2;
    }

}

class Data {
    int value = 100;
}
