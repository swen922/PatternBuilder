package engine;

public class DieselEngine implements Engine {

    private EngineType engineType = EngineType.DIESEL;
    private int maxForce = 350;

    @Override
    public EngineType engineType() {
        return EngineType.DIESEL;
    }

    @Override
    public int maxForce() {
        return this.maxForce;
    }

    @Override
    public void work() {
        System.out.println("GR-GR-GR-GR-GR-GR-GR! Diesel Engine");
    }

    @Override
    public String toString() {
        return "DieselEngine{" +
                "engineType=" + engineType +
                ", maxForce=" + maxForce +
                '}';
    }
}
