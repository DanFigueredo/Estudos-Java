package JavaExercises;

import JavaExercises.Domain.Game;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise39 {
    static void main(String[] args) {
        ArrayList<Game> games = new ArrayList<>();
        Scanner  scanner = new Scanner(System.in);
        int option = -1;
        while(true){
            System.out.println("1 - List games");
            System.out.println("2 - Add game");
            System.out.println("3 - Search game");
            System.out.println("4 - Remove game");
            System.out.println("5 - Exit");
            System.out.println("Choose any option: ");
            option = scanner.nextInt();
            System.out.println("=====================");
            scanner.nextLine();


            if (option == 1)
            {
                for(int i  = 0; i < games.size(); i++){
                    Game game = games.get(i);
                    game.showData();
                }
            }//end 1st option

            if (option == 2){
                String name;
                double price = 0.0;
                System.out.print("What is the game name? ");
                name = scanner.nextLine();


                System.out.print("How much this game? ");
                price = scanner.nextDouble();
                scanner.nextLine();

                Game game = new Game(name, price);
                games.add(game);
            }//end 2st option

            if (option == 3){
                String search;
                System.out.println("Which game do you want to search? ");
                search = scanner.nextLine();
                boolean found = false;
                for(Game game : games){
                    if (search.equals(game.getName())) {
                        found = true;
                        break;
                    }
                }
                if (found){
                    System.out.println("This game is on the list");
                }else{
                    System.out.println("This game is not on the list");
                }

            }//end 3st option

            if (option == 4){
                int choose = -1;
                System.out.println("What game do you want to remove? ");
                choose = scanner.nextInt();
                if (choose > games.size() || choose < 1) {
                    System.out.println("Please choose a valid option");
                    continue;
                }
                System.out.println("Game removed");
                games.remove(choose - 1);

            }//end 4st option

            if (option == 5){
                System.out.println("Exiting the program");
                break;
            }
        }
    }
}
