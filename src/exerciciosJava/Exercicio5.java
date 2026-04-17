package exerciciosJava;

import java.util.Scanner;
/*
Daniel Figueredo
17/04/2026
Programa que le nome idade e salario e mostra se pode fazer um financiamento ou não.
 */
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        double salary;
        System.out.print("Digite seu nome:");
        name = scanner.nextLine();
        System.out.print("Digite sua idade: ");
        age = scanner.nextInt();
        System.out.print("Digite seu salario: ");
        salary = scanner.nextDouble();

        System.out.println("====>VERIFICANDO<====");
        if (age < 18){
            System.out.println("Não pode financiar");
        }else if (age >= 18 && salary < 3000){
            System.out.println("Renda insuficiente");
        }else{
            System.out.println("Financiamento aprovado");
        }

        scanner.close();
    }//fim do programa
}
