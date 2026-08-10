package JavaExercises;

import java.util.ArrayList;

public class Exercise35 {
    public static void main(String[] args) {
        ArrayList<String > names = new ArrayList<>();
        names.add("Daniel");
        names.add("João");
        names.add("Maria");
        names.add("Miguel");
        names.add("Rogerio");

        System.out.println(names);

        for(int i = 0; i < names.size(); i++ ){
            System.out.println(names.get(i));
        }
        System.out.println("==========================\n");
        System.out.println("Size: " + names.size());

        System.out.println("First name: " + names.getFirst());
        System.out.println("Last name: " + names.getLast());
    }
}
