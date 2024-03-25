package races;

public class Dwarf implements IRace {
    @Override
    public double getExtraStrength() {
        return 1.07;
    }

    @Override
    public double getExtraIntelligence() {
        return 1;
    }

    @Override
    public double getExtraEndurance() {
        return 1.03;
    }

    @Override
    public double getExtraAgility() {
        return 1;
    }
}
