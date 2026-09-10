package JavaExercises;

import java.util.Scanner;

public class Exercise49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String aleatoryString = "";
        System.out.print("Enter anything: ");
        aleatoryString = scanner.nextLine();
        String cleanText = aleatoryString.trim();
        if (cleanText.isEmpty()) {
            System.out.println("The text cannot be empty.");
            return;
        }


        System.out.println("No space: " + cleanText);
        System.out.println("Character quantity: " + cleanText.length());
        System.out.println("Plus text: " + cleanText.toUpperCase());
        System.out.println("Minus text: " + cleanText.toLowerCase());
        System.out.println("First character: " + cleanText.charAt(0));
        System.out.println("Last character: " + cleanText.charAt(cleanText.length() - 1));
        System.out.println("-: " + cleanText.replace(" ", "-"));
        if (cleanText.length() >= 5) {
            System.out.println("First five characters: " + cleanText.substring(0, 5));
        } else {
            System.out.println("The text has fewer than five characters: " + cleanText);
        }
        System.out.println("Contains java: " + cleanText.toLowerCase().contains("java"));
        System.out.println("Original string: " + aleatoryString);

        scanner.close();


    }
}