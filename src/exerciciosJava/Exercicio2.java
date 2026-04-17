package exerciciosJava;

import java.util.Scanner;
/*
Daniel Figueredo
16/04/2026
Programa que pede dados ao usuario e retorna eles utilizando condições
*/

public class Exercicio2 {
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name;
        int age = 0;
        double salary;

        System.out.print("Digite sua idade: ");
        age  = scanner.nextInt();
        scanner.nextLine();

        System.out.print("\nDigite seu nome: ");
        name = scanner.nextLine();

        System.out.print("\nDigite seu salario: ");
        salary = scanner.nextDouble();

        System.out.println("\n====>Dados<====\n");
        System.out.println("Nome: "+ name);
        System.out.println("Salario: " + (double) salary);
        if (age >= 18){
            System.out.println("Idade: " + age + " (maior de idade)");
        }else{
            System.out.println("Idade: " + age + " (menor de idade)");
        }
    }//fim do programa
}
