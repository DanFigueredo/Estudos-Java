package JavaExercises;

import JavaExercises.Domain.BankAccount;

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name: ");
        bankAccount.setHolder(scanner.nextLine());
        bankAccount.deposit(1000);
        bankAccount.withdraw(800);
        bankAccount.withdraw(1000);
        bankAccount.showData();

    }
}
