package builder;

import car.Car;
import engine.Engine;

public class CarBuilder implements Builder {

    private Car car;

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int seatsQuantity) {
        car.setSeats(seatsQuantity);
    }

    @Override
    public void setEngine(Engine engine) {
        car.setEngine(engine);
    }

    @Override
    public void setTripComputer(boolean installTC) {
        car.setInstallTC(installTC);
    }

    @Override
    public void setGPS(boolean installGPS) {
        car.setInstallGPS(installGPS);
    }

    public Car getResult() {
        return this.car;
    }
}
