package JavaExercises;

import javacore.introductionmethods.domain.Calculator;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        int option = 0;
        int n1, n2;
        n1 = n2 = 0;


        while(true)
        {
            System.out.println("1 - Add\n" +
                    "2 - Subtract\n" +
                    "3 - Multiply\n" +
                    "4 - Divide\n" +
                    "0 - Exit");

            System.out.print("Choose the option: ");
            option = scanner.nextInt();
            if (option == 0) {
                System.out.println("Finished");
                break;
            }

            System.out.print("Write the 1st number: ");
            n1 = scanner.nextInt();

            System.out.print("Write the 2st number: ");
            n2 = scanner.nextInt();

            if (option == 1) {
                System.out.println("Sum: " + calculator.add(n1,n2));
            } else if (option == 2) {
                System.out.println("Subtract: " + calculator.subtract(n1,n2));
            }else if (option == 3) {
                System.out.println("Multiply: " + calculator.multiply(n1,n2));

            }else if (option == 4) {
                System.out.println("Divide: " + calculator.divide(n1,n2));
            }else{
                System.out.println("Invalid option");
            }
        }
        scanner.close();
    }
}
