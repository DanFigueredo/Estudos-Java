package introducaoJava;
/*
Daniel Figueredo
16/04/2026
Programa para aprender sobre operadores em Java
 */
public class aula04Operadores {
    public static void main(String[] args){
        int n1 = 10;
        int n2 = 20;
        float result = (float) n1 / n2;
        System.out.println(result);

        //% == resto da divisão
        //exemplo pra verificar se é par ou impar
        int num = 10;
        if (num % 2 == 0){
            System.out.println(num+ " É par!");
        }else{
            System.out.println(num + "É impar!");
        }
        /* >< (maior e menor),
         == (igual),
         >=<=(maior igual ou menor igual),
         != (Diferente de ),
         && (E)
         || (Ou)
         ! (Not)
        */

    }//fim do programa
}
