package javacore.Collections.Test;

import javacore.Collections.Domain.Game;

public class TestEquals01 {
    public static void main(String[] args) {
        Game game1 = new Game("Minecraft", "Mojang");
        Game game2 = new Game("Minecraft", "Mojang");

        System.out.println(game1.equals(game2));
    }
}
