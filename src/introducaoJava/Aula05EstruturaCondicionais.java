package introducaoJava;

import java.util.Scanner;
/*
Daniel Figueredo
17/04/2026
Programa que pede dois numeros e retorna se são iguais e qual o maior
 */
public class Aula05EstruturaCondicionais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        System.out.print("Digite um numero: ");
        n1  = scanner.nextInt();
        System.out.print("Digite outro numero: ");
        n2  = scanner.nextInt();

        if (n1 > n2){
            System.out.println("O maior numero é: "+ n1);
        } else if (n1 == n2) {
            System.out.println("Os dois numeros são iguais");
        }else{
            System.out.println("O maior numero é: "+ n2);
        }
    }
}
