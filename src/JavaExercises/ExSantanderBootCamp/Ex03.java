package JavaExercises.ExSantanderBootCamp;

import JavaExercises.ExSantanderBootCamp.Domain.Cash;
import JavaExercises.ExSantanderBootCamp.Domain.CreditCard;
import JavaExercises.ExSantanderBootCamp.Domain.PaymentMethod;
import JavaExercises.ExSantanderBootCamp.Domain.Pix;

import java.util.Scanner;

public class Ex03 {
   public static void main(String[] args) {

       int option;

       while (true){
           System.out.println("Choose any option: ");
           System.out.print("1 - Credit card\n");
           System.out.print("2 - Pix\n");
           System.out.print("3 - Cash\n");
           System.out.print("4 - End\n");
           option = scanner.nextInt();
           if (option < 1 || option > 4){
               System.out.println("Invalid option!");
               continue;
           }

           if (option == 1){
               creditPayment();
           } else if (option == 2) {

               pixPayment();
           } else if (option == 3) {
               cashPayment();
           }else{
               break;
           }


       }


    }

    static Scanner scanner = new Scanner(System.in);
    static PaymentMethod cash = new Cash();
    static PaymentMethod pix = new Pix();
    static PaymentMethod credit = new CreditCard();

    static void pixPayment(){
        System.out.println("What amount do you wish deposit? ");
        pix.pay(scanner.nextDouble());

    }

    static void creditPayment(){
        System.out.println("What amount do you wish deposit? ");
        credit.pay(scanner.nextDouble());
    }

    static void cashPayment(){
        System.out.println("What amount do you wish deposit? ");
        cash.pay(scanner.nextDouble());
    }
}
