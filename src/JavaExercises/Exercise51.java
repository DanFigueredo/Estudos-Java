package JavaExercises;

import java.io.*;
import java.nio.Buffer;

public class Exercise51 {
    public static void main(String[] args) {
        File file = new File("games.txt");
        try{
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("====GAMES====");
            bw.newLine();
            bw.write("Valorant");
            bw.newLine();
            bw.write("GTA 6");
            bw.newLine();
            bw.write("Wolverine");
            bw.flush();

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String i;

            while( (i = br.readLine() ) != null ){
                System.out.println(i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
