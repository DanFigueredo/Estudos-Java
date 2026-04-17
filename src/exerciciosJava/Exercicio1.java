package exerciciosJava;
/*
Daniel Figueredo
15/04/2026
Programa que Pegue dados e mostre na saida
 */
public class Exercicio1 {
    public static void main(String[] args) {
        String name = "Daniel";
        int age = 19;
        double payChek = 1512.00;
        String states;
        if (age >= 18)
        {
            states = "Maior de idade";
        }else{
            states = "Menor de idade";
        }

        System.out.println("Nome: "+name +
                            "\nidade: "+age +
                            "\nSalario: "+payChek +
                            "\nStatus: "+ states);
    }//fim do programa
}
