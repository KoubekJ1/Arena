package races;

public class DarkElf implements IRace {
    @Override
    public double getExtraStrength() {
        return 1;
    }

    @Override
    public double getExtraIntelligence() {
        return 1.04;
    }

    @Override
    public double getExtraEndurance() {
        return 1;
    }

    @Override
    public double getExtraAgility() {
        return 1.06;
    }
}
