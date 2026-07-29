package JavaExercises.ExSantanderBootCamp;

import JavaExercises.ExSantanderBootCamp.Domain.CalculateValue;

public class Health implements CalculateValue {
    @Override
    public void calculateTax(Double price) {
        double tax = price * 0.15;
        System.out.println("Tax: " + tax);
    }
}
