package Projetos;

import java.util.Scanner;

/*
Daniel Figueredo
17/04/2026
Projeto
 */
public class SistemaCadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age = 0;
        double  salary = 0.0;
        String states;
        System.out.println("==== SISTEMA DE CADASTRO ====");
        System.out.print("Digite seu nome: ");
        name = scanner.nextLine();
        System.out.print("Digite sua idade: ");
        age = scanner.nextInt();
        System.out.print("Digite seu salario: ");
        salary = scanner.nextDouble();

        System.out.println("\n==== CADASTRANDO O USUARIO ====");
        System.out.println("\n==== CADASTRADO COM SUCESSO ====");
        System.out.println("Nome: " + name);
        if (age >= 18){
            System.out.println("Idade: " + age + " (Maior de idade)");
        }else{
            System.out.println("Idade: " + age + " (menor de idade)");
        }
        System.out.println("Salario: " + salary);
        if (salary < 2000){
            System.out.println("Classe: Baixa renda");
        }else if (salary <= 5000){
            System.out.println("Classe: Média renda");
        }else{
            System.out.println("Classe: Alta renda");
        }

        if (age >= 18 && salary >= 3000){
            states = "Pode financiar";
        }else if (age >= 18 && salary <= 3000){
            states = "Renda insuficiente";
        }else{
            states = "Não pode financiar";
        }
        System.out.println("Status: " + states);

        scanner.close();

    }//fim do programa
}
