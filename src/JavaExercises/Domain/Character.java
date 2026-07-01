package JavaExercises.Domain;

public class Character {
    private String name;
    private int health;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void attack(){
        System.out.println("Generic attack");
    }
    public void showData() {
        System.out.println("Name: " + getName());
        System.out.println("Health: " + getHealth());
    }
}
