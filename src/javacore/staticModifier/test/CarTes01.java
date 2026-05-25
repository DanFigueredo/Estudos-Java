package javacore.staticModifier.test;

import javacore.staticModifier.domain.Car;

public class CarTes01 {
    public static void main(String[] args) {
        Car c1 = new Car("Bmw", 290);
        c1.printer();
        Car.limitSpeed = 300;
        c1.printer();
    }
}
