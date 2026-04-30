package JavaExercises;
/*
Daniel Figueredo
27/04/2026
Programa que le 2 arrays e faz um terceiro com a soma dos dois primeiros
 */
public class Exercicio9 {
    public static void main(String[] args) {
        int vet1[] = {10,20,30};
        int vet2[] = {40,50,60};
        int i;
        //Show the first
        System.out.println("First array:");
        for (i = 0; i < vet1.length; i++)
        {
            System.out.println(vet1[i]);
        }

        //Show the second
        System.out.println("Second array:");
        for (i = 0; i < vet2.length; i++)
        {
            System.out.println(vet2[i]);
        }

        //add the two
        System.out.println("Third array:");
        int tam = vet1.length;
        int vet3[]= new int[tam];
        for (i = 0; i < tam; i++)
        {
            vet3[i] = vet1[i] + vet2[i];
            System.out.println(vet3[i]);
        }

    }
}
