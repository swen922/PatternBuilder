package builder;

import car.Manual;
import engine.Engine;

public class ManualBuilder implements Builder {

    private Manual manual;


    @Override
    public void reset() {
        manual = new Manual();
        System.out.println("ManualBuilder reset");
    }

    @Override
    public void setSeats(int seatsQuantity) {
        this.manual.setSeats(seatsQuantity);
    }

    @Override
    public void setEngine(Engine engine) {
        this.manual.setEngine(engine);
    }

    @Override
    public void setTripComputer(boolean installTC) {
        this.manual.setInstallTC(installTC);
    }

    @Override
    public void setGPS(boolean installGPS) {
        this.manual.setInstallGPS(installGPS);
    }

    public Manual getResult() {
        return new Manual();
    }
}
