package JavaExercises;

import JavaExercises.Domain.Movie;

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Movie movie = new Movie();
        System.out.print("Write the movie title: ");
        movie.setTitle(scanner.nextLine());
        System.out.print("Write the movie genre: ");
        movie.setGenre(scanner.nextLine());
        System.out.print("Write the movie duration: ");
        movie.setDuration(scanner.nextDouble());

        System.out.println("------->Movie registred<-------");
        movie.showData();


    }
}
