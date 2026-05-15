package JavaExercises;


import javacore.builders.domain.Rectangle;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.print("What is width? ");
        rectangle.setWidth(scanner.nextDouble());
        System.out.print("What is height? ");
        rectangle.setHeight(scanner.nextDouble());
        rectangle.calculateArea();
        rectangle.showData();

    }
}
