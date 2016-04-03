package by.hubarevich.trainsystem.entities;

import by.hubarevich.trainsystem.util.IdGenerator;

/**
 * This class is for Electric locomotives. Serie is 100.
 */
public class ElectricLocomotive extends Locomotive{

    private static int serie  = 200;
    private int locomotiveId;


    public ElectricLocomotive(String baseStation, int horsePower, String driver) {
        super(baseStation, horsePower, driver);

        this.locomotiveId = serie + IdGenerator.generateId();

    }


    @Override
    public int getLocomotiveId() {
        return locomotiveId;
    }

    @Override
    public String toString() {
        return "This locomotive is Electric type. The power of engine: " + String.valueOf(getHorsePower()) + "hP. " +
                "The base station is " + String.valueOf(getBaseStation()) + ". Driver's name: " + String.valueOf(getDriver());
    }
}
