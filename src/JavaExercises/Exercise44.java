package JavaExercises;

import java.io.IOException;
import java.util.Scanner;



public class Exercise44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;

        System.out.print("How old are you? ");
        age = scanner.nextInt();
        checkAge(age);
    }

    public static void checkAge(int age){
        if (age < 18){
            throw new IllegalArgumentException("You must be 18 or older");
        }
        System.out.println("Access granted!");
    }
}
