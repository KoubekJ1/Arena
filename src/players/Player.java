package players;

import players.strategies.BattleStrategy;
import races.IRace;

public abstract class Player implements IBattle {

    private static final int XP_REQUIREMENT = 100;

    protected String name;
    protected int level;
    protected int strength;
    protected int agility;
    protected int intelligence;
    protected int endurance;
    protected int xp;

    protected BattleStrategy battleStrategy;

    private IRace race;

    private double hp;

    public double getStrength() {
        return strength * race.getExtraStrength();
    }

    public double getAgility() {
        return agility * race.getExtraAgility();
    }

    public double getIntelligence() {
        return intelligence * race.getExtraIntelligence();
    }

    public double getEndurance() {
        return endurance * race.getExtraEndurance();
    }

    public Player(String name, IRace race, BattleStrategy battleStrategy) {
        this.name = name;
        this.level = 1;
        this.hp = getMaxHealth();
        this.strength = 1;
        this.agility = 1;
        this.intelligence = 1;
        this.endurance = 1;
        this.race = race;
        this.battleStrategy = battleStrategy;
        this.battleStrategy.setParentPlayer(this);
    }

    public void addXP(int xp) {
        this.xp += xp;
        while (xp > XP_REQUIREMENT) {
            xp -= XP_REQUIREMENT;
            level++;
        }
    }

    public boolean damage(Player player2) {
        return damage(player2.attack() - defend());
    }

    private boolean damage(int damage) {
        this.hp -= damage;
        return hp <= 0;
    }

    public int getMaxHealth() {
        return level * 10;
    }

    public int getLevel() {
        return this.level;
    }
}
