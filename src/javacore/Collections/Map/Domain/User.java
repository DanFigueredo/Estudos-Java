package javacore.Collections.Map.Domain;

import java.util.concurrent.ThreadLocalRandom;

public class User {
    private long id;
    private String name;

    public User( String name) {
        this.id = ThreadLocalRandom.current().nextLong(0,100_000);
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return Math.toIntExact(id);
    }
}
