package dkit.oop;

public class CargoAirplane extends Airplane{
    // fields (ref. Q1)
    private int MAX_LOAD_KILOS;
    private int currentLoad;

    // constructor
    public CargoAirplane(String type, int MAX_LOAD_KILOS, int currentLoad) {
        super(type);
        this.MAX_LOAD_KILOS = MAX_LOAD_KILOS;
        this.currentLoad = currentLoad;
    }

    public CargoAirplane(String type, int MAX_LOAD_KILOS) {
        super(type);
        this.MAX_LOAD_KILOS = MAX_LOAD_KILOS;
    }

    // toString()
    @Override
    public String toString() {
        return "CargoAirplane{" +
                "MAX_LOAD_KILOS=" + MAX_LOAD_KILOS +
                ", currentLoad=" + currentLoad +
                '}';
    }

    public int getMAX_LOAD_KILOS() {
        return MAX_LOAD_KILOS;
    }

    public void setMAX_LOAD_KILOS(int MAX_LOAD_KILOS) {
        this.MAX_LOAD_KILOS = MAX_LOAD_KILOS;
    }

    public int getCurrentLoad() {
        return currentLoad;
    }

    public void setCurrentLoad(int currentLoad) {
        this.currentLoad = currentLoad;
    }
} // END of CargoAirplane class.