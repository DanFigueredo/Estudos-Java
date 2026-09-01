package JavaExercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise46 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int[] array = {10,20,30,40,50};
       int index;
       int divisor = -1;

       try{
           System.out.println("Enter the index: ");

           index = scanner.nextInt();

           System.out.println("Enter the divisor: ");
           divisor = scanner.nextInt();

           System.out.println("Result: " + (array[index-1]/ divisor));
       }catch (InputMismatchException e){
           System.out.println("Error: You must enter an integer.");
       }catch (ArrayIndexOutOfBoundsException e){
           System.out.println("Error: Invalid array index.");
       }catch (ArithmeticException e){
           System.out.println("Error: Cannot divide by zero.");
       }finally {
           scanner.close();
           System.out.println("Operation finished.");
       }

    }
}
