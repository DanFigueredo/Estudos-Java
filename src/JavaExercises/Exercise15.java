package JavaExercises;


import javacore.builders.domain.Product;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Product product = new Product();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write the product name: ");
        product.setName(scanner.nextLine());

        System.out.print("Write the product price: ");
        product.setPrice(scanner.nextDouble());
        product.showData();

    }
}
