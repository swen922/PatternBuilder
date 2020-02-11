import builder.Builder;
import builder.CarBuilder;
import builder.ManualBuilder;

public class App {

    public void makeSportCar() {
        Director director = new Director();
        Builder builder = new CarBuilder();

        director.buildSportCar(builder);

        builder = new ManualBuilder();
        director.buildSportCar(builder);
    }

}
