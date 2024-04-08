package players;

import players.strategies.WizardBattleStrategy;
import races.IRace;

public class Wizard extends Player {
    public Wizard(String name, IRace race) {
        super(name, race, new WizardBattleStrategy());
        this.intelligence += 3;
    }
}
