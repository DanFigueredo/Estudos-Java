package introducaoJava;

import java.util.Scanner;

/*
Daniel Figueredo
23/02/2026
Programa que Imprimir se é dia util ou final de semana
1 considerado como domingo
 */
public class Aula05EstruturaCondicionais02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte day = 0;
        System.out.print("Digite o dia da semana: ");
        day = scanner.nextByte();
        switch (day)
        {
            case 1:
                System.out.println("Domingo Final de semana");
                break;
            case 2:
                System.out.println("Segunda: Dia util");
                break;
            case 3:
                System.out.println("Terça: dia util");
                break;
            case 4:
                System.out.println("Quarta: dia util");
                break;
            case 5:
                System.out.println("Quinta: Dia util");
                break;
            case 6:
                System.out.println("Sexta: dia util");
                break;
            case 7:
                System.out.println("Sabado: Final de semana");
                break;
            default:
                System.out.println("Opção invalida");

        }//fim do switch
    }//fim do programa
}
