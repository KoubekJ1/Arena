package players.strategies;

import players.Player;

public class WarriorBattleStrategy extends BattleStrategy {
    public WarriorBattleStrategy(Player parentPlayer) {
        super(parentPlayer);
    }

    @Override
    public int getAttackStrategy() {
        return 0;
    }

    @Override
    public int getDefendStrategy() {
        return 0;
    }
}
