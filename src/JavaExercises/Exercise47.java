package JavaExercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise47 {
    public static void main(String[] args) {
        String[] products = {"Keyboard", "Mouse", "Monitor"};
        double[] prices = {200.00, 100.00, 900.00};
        double amount;
        int option;
        int quantity;
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Products:");
            for (int i = 0; i < products.length; i ++){
                System.out.println(products[i]);
            }
            System.out.print("What is the product's position? (1 - 3): ");
            option = scanner.nextInt();
            if (option < 1){
                throw new IllegalArgumentException();
            }
            System.out.print("What is the quantity? ");
            quantity = scanner.nextInt();
            if (quantity <= 0){
                throw new IllegalArgumentException();
            }

            amount = prices[option - 1 ] * quantity;
            System.out.println("Product picked: " + products[option - 1]);
            System.out.println("Price: " + prices[option - 1]);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total amount: " + amount);
        }catch (InputMismatchException | ArrayIndexOutOfBoundsException e){

            System.out.println("Error: Invalid product position or input.");
        }
    }
}
