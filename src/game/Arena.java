package game;

import players.Player;

public class Arena {
    public Player battle(Player player1, Player player2) {
        boolean end = false;
        boolean dead;
        Player winner = null;
        Player loser = null;
        while (!end) {
            if (player1.damage(player2)) {
                winner = player2;
                loser = player1;
                break;
            }
            if (player2.damage(player1)) {
                winner = player1;
                loser = player2;
                break;
            }
        }

        winner.addXP(10 * loser.getLevel());
        return winner;
    }
}
