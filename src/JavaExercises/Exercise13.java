package JavaExercises;

import javacore.introductionmethods.domain.Employee;
import javacore.introductionmethods.domain.Printer;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();
        Printer printer = new Printer();
        System.out.print("Whats is your name? ");
        employee.name = scanner.nextLine();

        System.out.print("How old are you? ");
        employee.age = scanner.nextInt();


        for (int i = 0; i < 3; i++){
            System.out.print("Write your salary: ");
            employee.salary[i] = scanner.nextDouble();
            scanner.nextLine();

        }
        employee.printer();
        System.out.println("--------------------------");
        employee.add(employee.salary);

    }
}
