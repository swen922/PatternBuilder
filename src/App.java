import builder.Builder;
import builder.CarBuilder;
import builder.ManualBuilder;
import car.Car;
import car.Manual;

public class App {

    private Director director;

    public static void main(String[] args) {
        App app = new App();
        app.director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        app.director.buildSportCar(carBuilder);
        Car car = carBuilder.getResult();
        car.drive();

        ManualBuilder manualBuilder = new ManualBuilder();
        app.director.buildSportCar(manualBuilder);
        Manual manual = manualBuilder.getResult();
        manual.read();
    }


}
