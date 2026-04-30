package JavaExercises;

import java.util.Scanner;

/*
Daniel Figueredo
28/04/2026
Programa que verifica se duas strings são um palindromo.
 */
public class Exercicio10 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String s1 = "";

        while (true)
        {

            System.out.println("If you want stop enter: 0");
            System.out.print("Enter a word: ");
            s1 = scanner.nextLine();
            s1 = s1.toLowerCase();
            String s2 = "";
            if(s1.equals("0"))
            {
                System.out.println("FINISHED PROGRAM");
                break;
            }else{
                for (int i = s1.length()-1; i >= 0; i--)
                {
                    s2 = s2 + s1.charAt(i);
                }

                if (s1.equals(s2)){
                    System.out.println("You word is a palindrome");
                }else
                    System.out.println("You word is not a palindrome");
            }

        }//end  while

    }
}
