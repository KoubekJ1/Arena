package players;

import races.IRace;

public class Scout extends Player {
    public Scout(String name, IRace race) {
        super(name, race);
        this.agility += 3;
    }

    @Override
    public int attack() {
        return  3 * agility;
    }

    @Override
    public int defend() {
        return agility + endurance;
    }
}
