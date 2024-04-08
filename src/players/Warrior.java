package players;

import players.strategies.WarriorBattleStrategy;
import races.IRace;

public class Warrior extends Player {
    public Warrior(String name, IRace race) {
        super(name, race, new WarriorBattleStrategy());
        this.strength += 3;
    }

    @Override
    public int attack() {
        return 3 * strength;
    }

    @Override
    public int defend() {
        return agility + endurance;
    }
}
