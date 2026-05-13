package javacore.builders.domain;

public class Anime02 {
    private String name;
    private int episode;

    public void init(String name, int episode){
        this.name = name;
        this.episode = episode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEpisode() {
        return episode;
    }

    public void setEpisode(int episode) {
        this.episode = episode;
    }
}
