package JavaExercises;

import java.util.Scanner;

public class Exercise45 {
    public static void main(String[] args) {
        int num1, num2;
        boolean success = false;
        Scanner scanner = new Scanner(System.in);


        try{
            System.out.println("Write a first number:  ");
            num1 = scanner.nextInt();
            System.out.println("Write a second number: ");
            num2 = scanner.nextInt();

            System.out.println("Result: " + (num1/num2));
            success = true;
        }catch (ArithmeticException e ){
            System.out.println("You can't divide a number by zero");
        }finally {
            scanner.close();
            System.out.println("Division attempt finished.");

        }
        if (success){
            System.out.println("Division made successfully");
        }
    }
}
