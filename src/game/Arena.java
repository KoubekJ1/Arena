package game;

import players.Player;

public class Arena {
    public Player battle(Player player1, Player player2) {
        boolean end = false;
        boolean dead;
        Player winner = null;
        while (!end) {
            dead = player1.damage(player2);
            if (dead) {
                winner = player2;
                break;
            }
            dead = player2.damage(player1);
            if (dead) {
                winner = player1;
                break;
            }
        }

        return winner;
    }
}
