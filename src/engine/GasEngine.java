package engine;

public class GasEngine implements Engine {

    private EngineType engineType = EngineType.GAS;
    private int maxForce = 200;

    @Override
    public EngineType engineType() {
        return this.engineType;
    }

    @Override
    public int maxForce() {
        return this.maxForce;
    }

    @Override
    public void work() {
        System.out.println("R-R-R-R-R-R-R! Gas Engine");
    }

    @Override
    public String toString() {
        return "GasEngine{" +
                "engineType=" + engineType +
                ", maxForce=" + maxForce +
                '}';
    }
}
