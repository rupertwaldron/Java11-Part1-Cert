package com.ruppyrup.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class CarExample {
    public static void main(String[] args) {
        CarMall carMall = new CarMall();
        CarFilter filter = new CompanyFilter("Honda");
        List<Car> carsByCompany = carMall.showCars(filter); // old way
        System.out.println(carsByCompany);
        System.out.println(carMall.showCars(c -> c.price > 6000)); // replace with lambda as carfilter is functional interface

        Predicate<Car> priceCheck = c -> c.price > 9000.0;
        Predicate<Car> companyCheck = c -> c.company.equals("Honda");
        Predicate<Car> priceAndCompany = priceCheck.and(companyCheck);

        System.out.println(carMall.showCarsPred(priceAndCompany)); // combined predicates
        System.out.println(carMall.showCarsPred(priceCheck.or(companyCheck))); // or
        System.out.println(carMall.showCarsPred(priceCheck.negate())); // negate the condition

        Predicate<Car> equalsCar1 = Predicate.isEqual(new Car("Honda", 2012, 9000.0, "HATCH"));

        System.out.println("Last " + carMall.showCarsPred(equalsCar1));

        Consumer<Car> printCompany = car -> System.out.println(car.company);
        printCompany.accept(new Car("BMW", 2015, 90000.0, "SPORTS"));

        Supplier<Car> getCar = () -> new Car("BMW", 2018, 45000.0, "COUPE");
        System.out.println(getCar.get());

        carMall.getCars().forEach(car -> {
            car.price += 1000;
            car.company += ": Rupert owns";
            System.out.println(car);
        });
    }
}

class CompanyFilter implements CarFilter {
    private String company;
    public CompanyFilter(String c) {
        this.company = c;
    }

    @Override
    public boolean showCar(Car c) {
        return company.equals(c.company);
    }
}

class Car {
    String company; int year; double price; String type;

    public Car(String company, int year, double price, String type) {
        this.company = company;
        this.year = year;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
            "company='" + company + '\'' +
            ", year=" + year +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (year != car.year) return false;
        if (Double.compare(car.price, price) != 0) return false;
        if (company != null ? !company.equals(car.company) : car.company != null) return false;
        return type != null ? type.equals(car.type) : car.type == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = company != null ? company.hashCode() : 0;
        result = 31 * result + year;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}

class CarMall {
    List<Car> cars = new ArrayList<>();

    public CarMall() {
        cars.add(new Car("Honda", 2012, 9000.0, "HATCH"));
        cars.add(new Car("Honda", 2018, 17000.0, "SEDAN"));
        cars.add(new Car("Toyota", 2014, 19000.0, "SUV"));
        cars.add(new Car("Ford", 2014, 13000.0, "SPORTS"));
        cars.add(new Car("Nissan", 2017, 8000.0, "SUV"));
    }

    List<Car> showCars(CarFilter carFilter) { // by accepting carfilter as an interface the user decides
        return cars.stream()                // what cars to show
            .filter(carFilter::showCar)
            .collect(Collectors.toList());
    }

    List<Car> showCarsPred(Predicate<Car> carPredicate) { // use predicate rather than a custom interface
        return cars.stream()
            .filter(carPredicate)
            .collect(Collectors.toList());
    }

    public List<Car> getCars() {
        return List.copyOf(cars);
    }
}

@FunctionalInterface
interface CarFilter {
    boolean showCar(Car c);
}