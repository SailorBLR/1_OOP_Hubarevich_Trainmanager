package by.hubarevich.trainsystem.entities;

import by.hubarevich.trainsystem.util.IdGenerator;

/**
 * This class is just a joke. Ain't it funny?
 */
public class NuclearLocomotive extends Locomotive {

    private static int serie = 300;
    private int locomotiveId;

    public NuclearLocomotive(String baseStation, int horsePower, String driver) {
        super(baseStation, horsePower, driver);
        this.locomotiveId = serie + IdGenerator.generateId();
    }


    @Override
    public int getLocomotiveId() {
        return locomotiveId;
    }

    @Override
    public String toString() {
        return "This locomotive is NUCLEAR type. The power of engine: " + String.valueOf(getHorsePower()) + "kiloTonn. " +
                "The base station is " + String.valueOf(getBaseStation()) + ". Driver's name: " + String.valueOf(getDriver());
    }
}
