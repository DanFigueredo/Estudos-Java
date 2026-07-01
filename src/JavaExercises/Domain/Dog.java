package JavaExercises.Domain;

public class Dog extends Animal {
    private String sound = "Au Au";

    public String getSound() {
        return sound;
    }
    public void makeSound(){
        System.out.println(getSound());
    }
}
