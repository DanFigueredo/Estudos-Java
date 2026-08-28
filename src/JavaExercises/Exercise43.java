package JavaExercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, num2;
        try{
            System.out.print("Write the first number: ");
            num = scanner.nextInt();
            System.out.print("Write the second number: ");
            num2 = scanner.nextInt();
            System.out.println(num/num2);

        }catch (ArithmeticException e){
            System.out.println("You can't divide a number by 0");
        }catch (InputMismatchException e){
            System.out.println("Please write a number!");
        }finally {
            System.out.println("Program Executed");
        }

    }
}
