package builder;


import engine.Engine;

public interface Builder {
    public void reset();
    public void setSeats(int seatsQuantity);
    public void setEngine(Engine engine);
    public void setTripComputer(boolean installTC);
    public void setGPS(boolean installGPS);
}
