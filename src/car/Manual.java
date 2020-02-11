package car;

import engine.Engine;

public class Manual {

    private int seats;
    private Engine engine;
    private boolean installTC;
    private boolean installGPS;

    public Manual() {
        System.out.println("created manual for new Car!");
    }

    public void setSeats(int seats) {
        this.seats = seats;
        System.out.println("manual setSeats = " + seats);
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
        System.out.println("manual engine = " + engine);
    }

    public void setInstallTC(boolean installTC) {
        this.installTC = installTC;
        System.out.println("manual installTC = " + installTC);
    }

    public void setInstallGPS(boolean installGPS) {
        this.installGPS = installGPS;
        System.out.println("manual installGPS = " + installGPS);
    }
}
