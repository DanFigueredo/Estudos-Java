package JavaExercises;

import JavaExercises.Domain.PasswordValidator;

import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        String confirmation;
        PasswordValidator password = new PasswordValidator();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write your password: ");
        password.setPassword(scanner.nextLine());

        if (password.getPassword().length() < 8){
            System.out.println("Your password needs 8 or more characters");
            return;
        }

        System.out.print("Confirm Your password: ");
        confirmation = scanner.nextLine();
        if (confirmation.equals(password.getPassword())){

            System.out.println("Valid Password!");
        }else{
            System.out.println("Invalid password!");
        }
        scanner.close();


    }
}
