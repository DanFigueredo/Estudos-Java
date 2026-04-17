package exerciciosJava;

import java.util.Scanner;

/*
Daniel Figueredo
17/04/2026
Programa que le 2 notas e calcule a media e mostre se esta aprovado
 */
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float nota1;
        float nota2;
        float media;
        System.out.print("Digite a primeira nota: ");
        nota1 = scanner.nextFloat();
        System.out.print("Digite a segunda nota: ");
        nota2 = scanner.nextFloat();
        System.out.println("====>VERIFICANDO<====");
        media = (nota1 + nota2) / 2;
        if (media >= 7){
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Recuperação");
        }else{
            System.out.println("Reprovado");
        }
        scanner.close();
    }//fim do programa
}
