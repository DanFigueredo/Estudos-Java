package JavaExercises;

import java.util.HashSet;
import java.util.Set;

public class Exercise40 {


    public class SetTest {
        static void main(String[] args) {
            Set<String> gameNames = new HashSet<>();

            gameNames.add("Minecraft");
            boolean added = true;
            System.out.println(added);

            boolean added2 = gameNames.add("Minecraft");
            System.out.println(added2);


        }
    }
}
