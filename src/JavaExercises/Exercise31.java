package JavaExercises;

import JavaExercises.Domain.Vehicle;

public class Exercise31 {
    public static void main(String[] args) {
        Vehicle motorcycle = new Vehicle();
        motorcycle.setName("BMX");
        motorcycle.setYear(2018);

        motorcycle.start();
        motorcycle.stop();

        Vehicle car = new Vehicle();
        car.setName("Maverick");
        car.setYear(2000);

        car.start();
        car.stop();

    }
}
