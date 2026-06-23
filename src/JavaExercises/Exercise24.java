package JavaExercises;

import JavaExercises.Domain.User;

public class Exercise24 {
    public static void main(String[] args) {

        User user = new User("Daniel");
        User user2 = new User("Stanley");
        User user3 = new User("Luiz");

        user.showData();
        user2.showData();
        user3.showData();
        user.showTotalUsers();

    }
}
