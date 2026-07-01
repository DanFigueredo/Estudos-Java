package JavaExercises;

import JavaExercises.Domain.Archer;
import JavaExercises.Domain.Character;
import JavaExercises.Domain.Mage;
import JavaExercises.Domain.Warrior;

public class Exercise28 {
    public static void main(String[] args) {
        Character character;
        character = new Mage();
        character.setName("Fire Mage");
        character.setHealth(80);
        character.showData();
        character.attack();

        character = new Archer();
        character.setName("Oliver Queen");
        character.setHealth(90);
        character.showData();
        character.attack();


        character = new Warrior();
        character.setName("Maximus");
        character.setHealth(110);
        character.showData();
        character.attack();


    }
}
