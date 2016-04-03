package by.hubarevich.trainsystem.entities;

import by.hubarevich.trainsystem.exception.WrongInputException;
import by.hubarevich.trainsystem.util.IdGenerator;


/**
 * Abstract class for all cargo units. Serie is 4000.
 */
public abstract class CargoWagon{

    private static final int COUNTER = 4000;
    private int cargoWagonId;
    private String cargoWagonType;
    private String baseStation;

    public CargoWagon(int wagonType, String baseStation) throws WrongInputException {


        this.cargoWagonId = COUNTER + IdGenerator.generateId();
        setBaseStation(baseStation);
        setWagonType(wagonType);


    }

    public void setBaseStation(String baseStation) {

        this.baseStation = baseStation;
    }

    private void setWagonType(int wagonType) throws WrongInputException {

        switch (wagonType) {
            case 0:
                this.cargoWagonType = "SOLID";
                break;
            case 1:
                this.cargoWagonType = "LIQUID";
                break;
            case 2:
                this.cargoWagonType = "FLAMMABLE";
                break;
            default:
                throw new WrongInputException();


        }
    }
}