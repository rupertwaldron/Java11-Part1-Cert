package com.ruppyrup.polymorphism;

class InterestCalculator {
    Number computeInterest(double principle, double years, double rate) throws Exception {
        if (years < 0) throw new IllegalArgumentException("years should be > 0");
        return principle * years * rate;
    }

}
public class CompoundInterestCalculator extends InterestCalculator { // different accessor

    @Override
    public Double computeInterest(double principle, double years, double rate) { // different return type
        return principle * Math.pow(1 + rate, years) - principle; // no exception thrown
    }
}
class Account {

    double balance;
    double rate;
    public Account(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }

    double getInterest(InterestCalculator ic, double years) {
        try {
            Number n = ic.computeInterest(balance, years, rate);
            return n.doubleValue();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0.0;
    }

}

class AccountManager {
    public static void main(String[] args) {
        Account a = new Account(100, 0.2);
        InterestCalculator ic1 = new InterestCalculator();
        double interest = a.getInterest(ic1, 2);
        System.out.println(interest);
        // get compound interest
        CompoundInterestCalculator ic2 = new CompoundInterestCalculator(); // uses overridden method in CICal
        double compoundInterest = a.getInterest(ic2, 2);
        System.out.println(compoundInterest);

        InterestCalculator ic3 = new CompoundInterestCalculator(); // even though it is type IC it still uses the CICal method
        double compoundInterest3 = a.getInterest(ic3, 2);
        System.out.println(compoundInterest3);
    }
}
