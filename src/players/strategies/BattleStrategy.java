package players.strategies;

import players.Player;

public abstract class BattleStrategy {
    private Player parentPlayer;

    public abstract int getAttackStrategy();
    public abstract int getDefendStrategy();

    public void setParentPlayer(Player parentPlayer) {
        this.parentPlayer = parentPlayer;
    }
}
