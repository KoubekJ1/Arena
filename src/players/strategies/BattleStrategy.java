package players.strategies;

import players.Player;

public abstract class BattleStrategy {
    private Player parentPlayer;

    public BattleStrategy(Player parentPlayer) {
        this.parentPlayer = parentPlayer;
    }

    public abstract int getAttackStrategy();
    public abstract int getDefendStrategy();
}
