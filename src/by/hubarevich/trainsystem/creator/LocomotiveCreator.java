package by.hubarevich.trainsystem.creator;

import by.hubarevich.trainsystem.entities.DieselLocomotive;
import by.hubarevich.trainsystem.entities.Locomotive;


/**
 * Class creates all types of Locomotives
 */
public class LocomotiveCreator {

    public Locomotive createDiesel(String baseCity, int horsePower, String driver) {

        return new DieselLocomotive(baseCity, horsePower, driver);
    }


    public Locomotive createElectric(String baseCity, int horsePower, String driver) {

        return new DieselLocomotive(baseCity, horsePower, driver);
    }

    public Locomotive createNuclear(String baseCity, int horsePower, String driver) {

        return new DieselLocomotive(baseCity, horsePower, driver);
    }
}
