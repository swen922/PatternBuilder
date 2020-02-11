package car;

import engine.Engine;

public class Car {

    private int seats;
    private Engine engine;
    private boolean installTC;
    private boolean installGPS;

    public Car() {
        System.out.println("created new Car!");
    }

    public void setSeats(int seats) {
        this.seats = seats;
        System.out.println("car setSeats = " + seats);
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
        System.out.println("car setEngine = " + engine);
    }

    public void setInstallTC(boolean installTC) {
        this.installTC = installTC;
        System.out.println("car installTC = " + installTC);
    }

    public void setInstallGPS(boolean installGPS) {
        this.installGPS = installGPS;
        System.out.println("car installGPS = " + installGPS);

    }
}
