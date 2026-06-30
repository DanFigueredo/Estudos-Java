package JavaExercises.Domain;

import java.util.Scanner;

public class Consult {
    private String patient;
    private String doctor;
    private double Appoiment;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        while(true){
            System.out.println("1 - Schedule appointment\n" +
                    "2 – Cancel appointment\n" +
                    "3 – Complete appointment\n" +
                    "4 - List appointments\n" +
                    "5 – Exit");

            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            if (option <= 0 || option > 5 )/{
                System.out.println("Invalid option!");
                return;
            }

            if (option == 1){

            }
        }
    }
}
