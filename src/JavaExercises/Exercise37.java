package JavaExercises;

import JavaExercises.Domain.Game;

import java.util.ArrayList;

public class Exercise37 {
   public static void main(String[] args) {
       ArrayList<Game> games = new ArrayList<>();
       games.add(new Game("Mine", 100));
       games.add(new Game("Gta V", 150));
       games.add(new Game("Spider- man", 120));

       for (int i = 0; i < games.size(); i ++){
           Game game = games.get(i);
           game.showData();
       }

    }
}
