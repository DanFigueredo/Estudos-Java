package javacore.introductionclasses.test;

import javacore.introductionclasses.Domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car01 = new Car();
        Car car02 = new Car();

        car01.name = "Golf";
        car01.model = "Generation";
        car01.year = 2002;

        car02.name = "Civic";
        car02.model = "LXS";
        car02.year = 2014;

        System.out.println("Car 1: ");
        System.out.println("Car Name: "+ car01.name);
        System.out.println("Car Model: "+ car01.model);
        System.out.println("Car Year: "+ car01.year);

        System.out.println("--------------------");
        System.out.println("Car 2: ");
        System.out.println("Car Name: "+ car02.name);
        System.out.println("Car Model: "+ car02.model);
        System.out.println("Car Year: "+ car02.year);
    }
}
