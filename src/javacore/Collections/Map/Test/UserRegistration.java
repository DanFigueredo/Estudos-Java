package javacore.Collections.Map.Test;

import javacore.Collections.Map.Domain.User;

import java.util.HashMap;
import java.util.Map;

public class UserRegistration {
    public static void main(String[] args) {
        //HashMap<Integer, String> user = new HashMap<>();
        User user1 = new User("Daniel");
        User user2 = new User("Rogerio");
        User user3 = new User("Miguel");
        User user4 = new User("Caliandra");
        User user5 = new User("Larissa");
        HashMap<Long, User> userRegister = new HashMap<>();
        userRegister.put(user1.getId(), user1);
        userRegister.put(user2.getId(), user2);
        userRegister.put(user3.getId(), user3);
        userRegister.put(user4.getId(), user4);
        userRegister.put(user5.getId(), user5);

        for(Map.Entry<Long, User> entry : userRegister.entrySet()){
            System.out.println(entry.getKey() +  " - " + entry.getValue().getName());
        }



    }
}
