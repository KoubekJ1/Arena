package players;

import players.strategies.WizardBattleStrategy;
import races.IRace;

public class Wizard extends Player {
    public Wizard(String name, IRace race) {
        super(name, race, new WizardBattleStrategy());
        this.intelligence += 3;
    }

    @Override
    public int attack() {
        return 3 * intelligence;
    }

    @Override
    public int defend() {
        return intelligence + endurance;
    }
}
