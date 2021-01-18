package simpleinterestpackage;

public class SimpleInterestCalculator {
    public double calculate(double principle, double rate, double time) {
        return principle * rate * time;
    }

    public static void main(String[] args) {
        System.out.println(new SimpleInterestCalculator().calculate(100, 0.05, 2));
        //InetAddressValidator v = new InetAddressValidator();
    }
}
