package JavaExercises;

import JavaExercises.Domain.Product;

import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product product = new Product();

        System.out.print("Write the product name: ");
        product.setName(scanner.nextLine());
        System.out.print("Write the product price: ");
        product.setPrice(scanner.nextDouble());
        System.out.print("Write the product stock: ");
        product.setStock(scanner.nextInt());
        product.addStock(10);
        product.delStock(5);

        product.showData();

    }
}
