import builder.Builder;
import engine.GasEngine;

public class Director {

    public void buildSportCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine(new GasEngine());
        builder.setTripComputer(true);
        builder.setGPS(false);
    }
}
