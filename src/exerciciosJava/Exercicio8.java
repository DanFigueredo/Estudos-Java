package exerciciosJava;
/*
Daniel Figueredo
27/04/2026
Programa que soma os elementos de um array
 */
public class Exercicio8 {
    public static void main(String[] args) {
        int [] numbers = {10,20,30,40,50};
        int i;
        int soma = 0;
        for (i = 0; i < numbers.length; i ++)
        {
           soma += numbers[i];
        }
        System.out.println("A soma e: "+ soma);

    }
}
