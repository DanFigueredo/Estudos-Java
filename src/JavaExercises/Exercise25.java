package JavaExercises;

import JavaExercises.Domain.ConsultorAccount;

import java.sql.SQLOutput;
import java.util.Scanner;



public class Exercise25 {
    public static void main(String[] args) {

        ConsultorAccount consultor = new ConsultorAccount();
        Scanner scanner = new Scanner(System.in);
        int option =0;


        System.out.println("Account Consultant");

        System.out.print("initial deposit: ");
        consultor.setInitialBalance(scanner.nextDouble());
        consultor.amount();


        while(true)
        {
            System.out.println("\nChoose one of these options: ");
            System.out.println("1 - Check balance\n" +
                    "2 - check overdraft balance\n" +
                    "3 - Deposit money\n" +
                    "4 - Withdraw money\n" +
                    "5 - Pay a payment slip\n" +
                    "6 - Check if the account is using an overdraft.\n" +
                    "7 - Exit");


            System.out.print("Choose: ");
            option = scanner.nextInt();
            if (option <=0 || option > 7){
                System.out.println("Invalid Option");
                return;
            }


            if (option == 1){
                consultor.checkBlance();

            }

            if (option == 2){
                consultor.checkOverDraft();
            }

            if (option == 3){
                System.out.print("What amount do you want deposit: ");
                consultor.depositBalance(scanner.nextDouble());
            }

            if (option == 4){
                System.out.print("What amount do you want withdraw: ");
                consultor.withDrawBalance(scanner.nextDouble());
            }

            if (option == 5){
                System.out.print("What value you wish pay: ");
                consultor.payTicket(scanner.nextDouble());

            }

            if (option == 6){
                consultor.checkUseOverdraft();
            }

            if (option == 7){
                break;
            }

        }
        scanner.close();
    }
}
