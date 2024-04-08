package players;

import players.strategies.ScoutBattleStrategy;
import races.IRace;

public class Scout extends Player {
    public Scout(String name, IRace race) {
        super(name, race, new ScoutBattleStrategy());
        this.agility += 3;
    }
}
