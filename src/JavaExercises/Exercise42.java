package JavaExercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise42 {
    public static void main(String[] args) {
        int num =0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a number: ");
        try{
            num = scanner.nextInt();
            System.out.println("Number read successfully ");
        }catch (InputMismatchException e){
            System.out.println("Please write a number! ");
        }
    }
}
