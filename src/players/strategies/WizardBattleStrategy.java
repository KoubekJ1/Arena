package players.strategies;

import players.Player;

public class WizardBattleStrategy extends BattleStrategy {

    @Override
    public int getAttackStrategy() {
        return (int) (3 * parentPlayer.getIntelligence());
    }

    @Override
    public int getDefendStrategy() {
        return (int) (enemy.getIntelligence() + enemy.getEndurance());
    }
}
