package JavaExercises;

import java.util.Scanner;

public class Exercise41 {
    public static void main(String[] args) {
        int num;
        int num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write the first number: ");
        num = scanner.nextInt();

        System.out.print("Write the second number: ");
        num2 = scanner.nextInt();



        try{
            System.out.println("Division: ");
            System.out.println(num/num2);

        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("");
        }

    }
}
