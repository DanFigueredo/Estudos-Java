package JavaExercises.Domain;

public class User {
    private String name;
    private static int totalUsers;

    public User(String name){
        totalUsers++;
        this.name = name;
    }

    public void showData(){
        System.out.println("User: " + name);

    }
    public void showTotalUsers(){
        System.out.println("Total users: " + totalUsers);
    }
}
