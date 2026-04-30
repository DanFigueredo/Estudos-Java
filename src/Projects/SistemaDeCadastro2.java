package Projects;

import java.util.Scanner;

/*
Daniel Figueredo
28/04/2026
 */
public class SistemaDeCadastro2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String names [] = new String[5];
        int ages [] = new int[5];
        int over18 = 0;
        double salaries [] = new double[5];
        int i;
        for (i = 0; i < names.length; i++)
        {
            System.out.print("Enter your name: ");
            names[i] = scanner.nextLine();

            System.out.print("Enter you age: ");
            ages[i] = scanner.nextInt();
            if (ages[i] >= 18)
            {
                over18 += 1;
            }

            System.out.print("Enter your salary: ");
            salaries[i] = scanner.nextDouble();

            scanner.nextLine();
        }

        for (i = 0; i < names.length; i++)
        {
            System.out.println("\nPerson " + (i+1));
            System.out.println("Name: " + names[i]);
            System.out.println("Age: " + ages[i]);
            System.out.println("Salary: " + salaries[i]);
        }

        System.out.println("\nOver 18 years: "+ over18);

    }
}
