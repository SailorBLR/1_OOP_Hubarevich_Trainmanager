package by.hubarevich.trainsystem.entities;

/**
 * Abstract class for all locomotive units. The series for each type of locomotives are different.
 */
public abstract class Locomotive{

    private int locomotiveId;
    private String baseStation;
    private int horsePower;
    private String driver;


    public Locomotive(String baseStation, int horsePower, String driver) {
        this.baseStation = baseStation;
        this.horsePower = horsePower;
        this.driver = driver;
    }


    public int getLocomotiveId() {
        return locomotiveId;
    }

    public String getBaseStation() {
        return baseStation;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

}
