package JavaExercises;

import java.util.ArrayList;

public class Exercise38 {
   public static void main(String[] args) {
       ArrayList<Integer> numbers = new ArrayList<>();
       numbers.add(1);
       numbers.add(2);
       numbers.add(3);
       numbers.add(4);
       numbers.add(5);
       numbers.add(6);
       numbers.add(7);
       numbers.add(8);
       numbers.add(9);
       numbers.add(10);

       System.out.println(numbers);
       System.out.println("------------------");
       numbers.remove(2);
       System.out.println(numbers);
       System.out.println("------------------");
       System.out.println(numbers.size());
       System.out.println(numbers.contains(9));
       System.out.println(numbers.contains(3));

    }
}
