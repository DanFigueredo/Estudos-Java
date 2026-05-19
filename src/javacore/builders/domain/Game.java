package javacore.builders.domain;

public class Game {
    private String name;
    private String genre;
    private double price;

    public Game(){

    }

    public Game(String name){
        this.name = name;

    }

    public Game(String name, String genre, double price){
        this.name = name;
        this.genre = genre;
        this.price = price;
    }

    public void showData(){
        System.out.println(this.name);
        System.out.println(this.genre);
        System.out.println(this.price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}


