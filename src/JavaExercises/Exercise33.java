package JavaExercises;

import JavaExercises.Domain.Book;
import JavaExercises.Domain.Eletronic;
import JavaExercises.Domain.Food;
import JavaExercises.Domain.Products;

public class Exercise33 {
    public static void main(String[] Args){
        Products book = new Book("Herobrine the legend", 90);
        book.calculateTax();
        book.showData();

        Products eletronic = new Eletronic("Samsumg A50", 5000);
        eletronic.calculateTax();
        eletronic.showData();

        Products food = new Food("Hot-Dog", 20);
        food.calculateTax();
        food.showData();


    }
}
