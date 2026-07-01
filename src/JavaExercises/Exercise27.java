package JavaExercises;

import JavaExercises.Domain.Animal;
import JavaExercises.Domain.Cat;
import JavaExercises.Domain.Dog;

public class Exercise27 {
    public static void main(String[] args) {
        Animal animal;
        animal = new Dog();
        animal.makeSound();

        animal = new Cat();
        animal.makeSound();


    }
}
