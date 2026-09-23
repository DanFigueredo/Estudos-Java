package JavaExercises;

import java.io.File;
import java.io.IOException;

public class Exercise50 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try{
            file.createNewFile();
            System.out.println("File name: " + file.getName());
            System.out.println("Exists: " + file.exists());
            System.out.println("File absolute path: " + file.getAbsolutePath());
            System.out.println("Is file: " + file.isFile());
            System.out.println("Is directory: " + file.isDirectory());
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }
}
