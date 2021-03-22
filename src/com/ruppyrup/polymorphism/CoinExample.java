package com.ruppyrup.polymorphism;

public class CoinExample {
    public static void main(String[] args) {
        Pound poundCoin = new Pound();
        Coin coinPound = new Pound();
        ICoin interPound = new Pound();


        // get pound values
        System.out.println(poundCoin.value); //100
        System.out.println(poundCoin.color); //Gold
        System.out.println(poundCoin.getCoin()); //Gold pound coin
        poundCoin.getValue(4); //Pound Method
        poundCoin.buyCoin();

        // get pound values
        System.out.println(coinPound.value); //50
        System.out.println(coinPound.color); //Copper
        System.out.println(coinPound.getCoin()); //Copper pound coin
        coinPound.getValue(4); //Pound Method
//        coinPound.buyCoin(); // doesn't work because Coin doesn't have the buyCoin() method need to cast
        ((Pound)coinPound).buyCoin();

        // get pound values
        System.out.println(interPound.value); //70
        System.out.println(interPound.color); //Platinum
        System.out.println(ICoin.getCoin()); //Platinum pound coin
        interPound.getValue(4); //Pound Method
//        interPound.buyCoin(); doesn't work as ICoin doesn't have buyCoin()
        ((Pound)interPound).buyCoin();

        // get coin values that are hiding
        System.out.println(((Coin) poundCoin).value); // 50
        System.out.println(((Coin) poundCoin).color); // Copper
        System.out.println(((Coin) poundCoin).getCoin()); //Copper coin
        ((Coin) poundCoin).getValue(5); //Pound Method
    }
}

class Coin {
    public int value = 50;
    public static String color = "Copper";
    public static String getCoin() {
        return color + " coin";
    }

    public void getValue(int multi) {
        System.out.println("Coin method");
    }
}

class Pound extends Coin implements ICoin{
    public int value = 100;
    public static String color = "Gold";
    public static String getCoin() {
        return color + " pound coin";
    }

    @Override
    public void getValue(int multi) {
        System.out.println("Pound method");
    }

    public void buyCoin() {
        System.out.println("You have bought a coin");
    }


}

interface ICoin {
    int value = 70;
    String color = "Platinum";
    static String getCoin() {
        return color + " coin";
    }
    void getValue(int mullti);
}