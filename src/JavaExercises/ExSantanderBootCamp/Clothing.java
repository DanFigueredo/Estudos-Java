package JavaExercises.ExSantanderBootCamp;

import JavaExercises.ExSantanderBootCamp.Domain.CalculateValue;

public class Clothing implements CalculateValue {
    @Override
    public void calculateTax(Double price) {
        double tax = price * 0.25;
        System.out.println("Tax: " + tax);
    }
}
