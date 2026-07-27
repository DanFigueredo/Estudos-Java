package JavaExercises;

import java.util.Scanner;

public class Exercise34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        System.out.print("Write an number: ");
        x = scanner.nextInt();

        System.out.print("Write another number: ");
        y = scanner.nextInt();


        Calculator sum = (a, b) -> {
            return a + b;
        };

        System.out.println(sum.sum(x,y));

        Calculator subtraction = (a, b) -> {
            return a - b;
        };

        System.out.println(subtraction.sum(x,y));

        Calculator multiplication = (a, b) -> {
            return a * b;
        };

        System.out.println(multiplication.sum(x,y));


    }
}
