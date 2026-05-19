package JavaExercises;

import javacore.builders.domain.Game;

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();
        System.out.print("What is game name? ");
        game.setName(scanner.nextLine());
        System.out.print("What is the genre? ");
        game.setGenre(scanner.nextLine());
        System.out.print("What is the game price? ");
        game.setPrice(scanner.nextDouble());
        game.showData();

    }
}
