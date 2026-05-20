package javacore.BootBlocks.Test;

import javacore.BootBlocks.Domain.Car;

public class TestCar01 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Mustang GT 500");
        car.showSpeeds();
    }
}
