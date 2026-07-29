package JavaExercises.ExSantanderBootCamp;

import JavaExercises.ExSantanderBootCamp.Domain.CalculateValue;

public class Ex2 {
    public static void main(String[] args) {
        CalculateValue food = new Food();
        food.calculateTax(10.50);

        CalculateValue health = price -> {
            System.out.println("Health Tax: " + price * 0.015);
        };
        health.calculateTax(55.8);
    }
}
