package exerciciosJava;

import java.util.Scanner;
/*
Daniel Figueredo
17/04/2026
Programa que Verifica se um numero é positivo ou ngeativo e se é par ou impar
 */

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        System.out.print("Digite um numero para ser verificado: ");
        num = scanner.nextInt();
        System.out.println("====>VERIFICANDO<====");
        if (num % 2 == 0){
            System.out.println(num + " É par");
        }else{
            System.out.println(num + " É impar");
        }

        if (num > 0){
            System.out.println(num + " É positivo");
        } else if (num < 0) {
            System.out.println(num + " É negativo");
        }else{
            System.out.println("É zero");
        }


    }//fim do programa
}
