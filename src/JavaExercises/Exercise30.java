package JavaExercises;

import JavaExercises.Domain.ConsoleGame;
import JavaExercises.Domain.Game;
import JavaExercises.Domain.MobileGame;
import JavaExercises.Domain.PCGame;

public class Exercise30 {
    public static void main(String[] args) {
        Game pc = new PCGame("PC gamer", 5000);
        pc.showData();

        Game console = new ConsoleGame("PS5", 3500);
        console.showData();

        Game mobile = new MobileGame("Iphone 14", 4500);
        mobile.showData();

    }
}
