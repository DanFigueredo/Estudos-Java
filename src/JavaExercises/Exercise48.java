package JavaExercises;

import java.util.Scanner;

public class Exercise48 {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        String name;
        String ageText;
        String heightText = "";
        String activeText = "";

        Integer age = 0;
        Double height = 0.0;
        Boolean active;


        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Name: ");
            name = scanner.nextLine();

            System.out.println("Age: ");
            ageText = scanner.nextLine();
            try{
                age = Integer.valueOf(ageText);
            }catch (NumberFormatException e){
                System.out.println("Invalid Age");
                return;
            }

            System.out.println("Height: ");
            heightText = scanner.nextLine();

            try{
                height = Double.valueOf(heightText);
            }catch (NumberFormatException e){
                System.out.println("Invalid Height");
                return;
            }
            System.out.println("Active (true/false): ");
            activeText = scanner.nextLine();
            active = Boolean.valueOf(activeText);
        }

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Age in five years: " + (age + 5));
        System.out.println("Height in centimeters: " + (height * 100));
        System.out.println("Active: " + active);

    }
}
