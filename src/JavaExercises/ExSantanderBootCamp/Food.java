package JavaExercises.ExSantanderBootCamp;

import JavaExercises.ExSantanderBootCamp.Domain.CalculateValue;

public class Food implements CalculateValue {
    @Override
    public void calculateTax(Double price) {
        double tax = price * 0.01;
        System.out.println("Tax: " + tax);
    }
}
