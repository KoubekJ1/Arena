package players.strategies;

import players.Player;

public class WarriorBattleStrategy extends BattleStrategy {

    @Override
    public int getAttackStrategy() {
        return (int) (3 * parentPlayer.getStrength());
    }

    @Override
    public int getDefendStrategy() {
        return (int) (enemy.getStrength() + enemy.getEndurance());
    }
}
