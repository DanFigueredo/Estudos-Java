package JavaExercises;

import java.util.ArrayList;

public class Exercise36 {
    public static void main(String[] args) {
        ArrayList<String> games = new ArrayList<>();
        games.add("Minecraft");
        games.add("GTA V");
        games.add("Valorant");
        games.add("FIFA");
        games.add("The withcer 3");
        for (int i = 0; i < games.size(); i ++){
            System.out.println(games.get(i));
        }

        System.out.println("==========================");

        games.remove("FIFA");
        games.remove(games.get(0));
        for (int i = 0; i < games.size(); i ++){
            System.out.println(games.get(i));
        }

        System.out.println(games.contains("Valorant"));

    }
}
