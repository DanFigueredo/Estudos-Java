package JavaExercises;

import java.util.Scanner;


public class Exercise22 {
    public static void main(String[] args) {
        String creditCardNumber = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write your credit card: ");
        creditCardNumber = scanner.nextLine();
        if(creditCardNumber.length() != 16){
            System.out.println("Invalid credit card number. It must be 16 digits long.");

        }

        String lastDigits = creditCardNumber.substring(creditCardNumber.length() - 4);
        String hide = "XXXX-XXXX-XXXX-" + lastDigits;
        System.out.println(hide);
    }
}
