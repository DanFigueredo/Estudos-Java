package javacore.methodoverloading.domain;

public class anime {
    private String type;
    private int episode;

    public void init(String type, int episode){
        this.type = type;
        this.episode = episode;
    }

    public void print(){
        System.out.println(this.type);
        System.out.println(this.episode);
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType() {
        return this.type;
    }

    public void setEpisode(int episode) {
        this.episode = episode;
    }

    public int getEpisode(){
        return this.episode;
    }
}
