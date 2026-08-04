package JavaExercises.ExSantanderBootCamp;

import JavaExercises.ExSantanderBootCamp.Domain.Printer;

public class Ex04 {
    public static void main(String[] args) {


        Printer printer1 = message -> System.out.println("Welcome to java");
        printer1.print("Imprimindo");
    }
}
