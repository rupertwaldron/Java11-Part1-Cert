package com.ruppyrup.polymorphism;

public class AccountTest {
    public static void main(String[] args) {
        MainAccount a = new DummyAccount(10.0); // no balance in dummy account as method is overridden
        // also get 10.0 as then call the super.printBalance() method from subclass
    }
}

class MainAccount {
    double balance = 0.0;

    public MainAccount(double balance) {
        this.balance = balance;
        this.printBalance(); // bad to call non private methods from constructor as they can be overridden
    }

    void printBalance() {
        System.out.println(balance);
    }
}

class DummyAccount extends MainAccount{
    double balance = 0.0;

    public DummyAccount(double balance) {
        super(balance);
    }

    void printBalance() {
        System.out.println("No balance in dummy account");
        super.printBalance();
    }
}