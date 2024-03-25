package races;

public class Troll implements IRace {
    @Override
    public double getExtraStrength() {
        return 1.10;
    }

    @Override
    public double getExtraIntelligence() {
        return 1;
    }

    @Override
    public double getExtraEndurance() {
        return 1;
    }

    @Override
    public double getExtraAgility() {
        return 1;
    }
}
