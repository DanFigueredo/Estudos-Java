package JavaExercises;

import javacore.introductionmethods.domain.BankAccount;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the name of the holder's account? ");
        bankAccount.setAccountHolder(scanner.nextLine());

        System.out.print("What is the account balance? ");
        bankAccount.setBalance(scanner.nextDouble());

        bankAccount.showData();
    }
}
