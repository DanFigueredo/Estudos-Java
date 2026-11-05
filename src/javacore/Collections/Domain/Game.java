package javacore.Collections.Domain;

public class Game {
    private String name;
    private String brand;


    public Game(String name, String brand) {
        this.brand = brand;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;


        if (this == obj) return true;


        if (this.getClass() != obj.getClass()) return false;

        Game game = (Game) obj;

        if (name == null && game.name == null && brand == null && game.brand == null) return true;



        if (name != null && name.equals(game.name) && brand != null && brand.equals(game.brand)){
            return true;
        }


        return false;
    }






    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
