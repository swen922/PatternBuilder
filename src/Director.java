import builder.Builder;
import engine.DieselEngine;
import engine.ElectricEngine;
import engine.GasEngine;

public class Director {

    public void buildSportCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine(new GasEngine());
        builder.setTripComputer(true);
        builder.setGPS(false);
    }

    public void buildOutDoorCar(Builder builder) {
        builder.reset();
        builder.setSeats(6);
        builder.setEngine(new DieselEngine());
        builder.setTripComputer(true);
        builder.setGPS(true);
    }

    public void buildGoofCar(Builder builder) {
        builder.reset();
        builder.setSeats(3);
        builder.setEngine(new ElectricEngine());
        builder.setTripComputer(false);
        builder.setGPS(false);
    }
}
