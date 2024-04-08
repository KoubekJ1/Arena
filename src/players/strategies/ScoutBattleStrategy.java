package players.strategies;

import players.Player;

public class ScoutBattleStrategy extends BattleStrategy {

    @Override
    public int getAttackStrategy() {
        return (int) (3 * parentPlayer.getAgility());
    }

    @Override
    public int getDefendStrategy() {
        return (int) (enemy.getAgility() + enemy.getEndurance());
    }
}
