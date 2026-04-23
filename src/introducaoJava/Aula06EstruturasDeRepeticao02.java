package introducaoJava;
/*
Daniel Figueredo
23/02/2026
Programa que imprimi os 25 numeros de um determinado valor
 */
public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        int Max = 50;
        for (int i = 0; i <= Max; i++){
            if (i > 25){
                break;
            }else{
                System.out.println(i);
            }
        }
    }
}
