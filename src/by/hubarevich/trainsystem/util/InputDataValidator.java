package by.hubarevich.trainsystem.util;

import by.hubarevich.trainsystem.entities.CivilWagon;
import by.hubarevich.trainsystem.entities.Train;
import by.hubarevich.trainsystem.exception.EmptyObjectException;
import by.hubarevich.trainsystem.exception.SameIdException;
import by.hubarevich.trainsystem.exception.WrongInputException;

/**
 * Validator class for all input data.
 */
public class InputDataValidator {

    private Train train;

    public InputDataValidator(Train train) {
        this.train = train;
    }


    public boolean wagonValidator() throws WrongInputException, EmptyObjectException, SameIdException {

        int countId;

        for (CivilWagon wagon : train.getWagons()) {
            if (wagon.getPassengersQuantity() <= 0 || wagon.getCargoPlaces() <= 0 || wagon.getCivilWagonId() <= 0) {
                throw new WrongInputException("You can't use values <= 0");
            }

            if (wagon == null) {

                throw new EmptyObjectException("You need to create not null Wagon object");

            }
            countId = 0;
            for (CivilWagon wagon2 : train.getWagons()) {

                if (wagon.getCivilWagonId() == wagon2.getCivilWagonId()) {
                    countId++;
                }
            }

            if (countId > 1) {
                throw new SameIdException("You can't create wagons with the same ID's");
            }


        }
        return true;
    }
}
