package JavaExercises.Domain;

public class Cat extends  Animal{
    private String sound = "Miau";

    public String getSound() {
        return sound;
    }

    public void makeSound(){
        System.out.println(getSound());
    }
}
