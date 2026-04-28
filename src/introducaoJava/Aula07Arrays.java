package introducaoJava;
/*
Daniel Figueredo
27/04/2026
Programa que utiliza arrays para imprimir numeros
 */
public class Aula07Arrays {
    public static void main(String[] args) {
        int i;
        int[] numbers = new int[5];
        int [] numbers2 = {1,2,3,4,5,6,7};
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        for (i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }

        for(int num : numbers2){
            System.out.println(num);
        }
    }
}
