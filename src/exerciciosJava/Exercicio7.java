package exerciciosJava;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int maior = 0;
        int menor = 0;
        for (int i = 1; i <= 10; i++){
            System.out.print("Digite o "+ i + " Numero: ");
            num = scanner.nextInt();
            if (i == 1){
                menor = num;
                maior = num;
            }
            if (num > maior){
                maior = num;
            }else if (num < menor){
                menor = num;
            }

        }
        System.out.println("O maior numero e: "+ maior);
        System.out.println("O menor numero e: "+ menor);
    }
}
