package engine;

public class ElectricEngine implements Engine {

    private EngineType engineType = EngineType.ELECTRIC;
    private int maxForce = 120;

    @Override
    public EngineType engineType() {
        return EngineType.ELECTRIC;
    }

    @Override
    public int maxForce() {
        return this.maxForce;
    }

    @Override
    public void work() {
        System.out.println("PS-S-S-S-S-S-S-S! Electric Engine");
    }

    @Override
    public String toString() {
        return "ElectricEngine{" +
                "engineType=" + engineType +
                ", maxForce=" + maxForce +
                '}';
    }
}
