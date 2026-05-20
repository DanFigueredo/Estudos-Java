package javacore.BootBlocks.Domain;

public class Anime {
    public int episodes[];

    {
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i+1;
            System.out.print(episodes[i] + " ");
        }
    }


}
