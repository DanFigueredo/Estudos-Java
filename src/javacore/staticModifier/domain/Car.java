package javacore.staticModifier.domain;

public class Car {
    private String brand;
    private double maxSpeed;
    public static double limitSpeed = 250;

    public Car(String brand, double maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public void printer(){
        System.out.println("-------------------");
        System.out.println(this.brand);
        System.out.println(this.maxSpeed);
        System.out.println(Car.limitSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
