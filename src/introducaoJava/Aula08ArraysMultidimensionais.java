package introducaoJava;

import java.util.Scanner;

public class Aula08ArraysMultidimensionais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] mat = new int[2][2];
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                System.out.print("Digite um numero: ");
                mat[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < mat.length; i++)
        {
            for (int j = 0; j < mat[i].length; j++)
            {
                System.out.println(mat[i][j]+ " ");
            }
        }
    }
}
