package javacore.association.test;

import javacore.association.domain.Player;

public class PlayerTest01 {
    public static void main(String[] args) {
        Player player1 = new Player("Neymar");
        Player player2 = new Player("Endrick");
        Player player3 = new Player("CR7");
        Player[] players = {player1, player2, player3};
        for(Player player : players){
            player.showData();
        }
    }
}
