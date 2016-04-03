package by.hubarevich.trainsystem.action;

import by.hubarevich.trainsystem.entities.CivilWagon;
import by.hubarevich.trainsystem.exception.WrongInputException;

import java.util.ArrayList;
import java.util.List;

/**
 * Class makes a search for wagons with the noted conditions
 */
public class WagonSearch {

    private int searchRes = 0;


    public String searchWagon(List<CivilWagon> wagons, Integer fromNum, Integer toNum ) throws WrongInputException {
        List<CivilWagon> resultSet = new ArrayList<>();

        for (CivilWagon wagon : wagons) {
            if (wagon.getPassengersQuantity() >= fromNum & wagon.getPassengersQuantity() <= toNum) {
                resultSet.add(wagon);
                searchRes++;
            }
        }
        if (fromNum <= 0 || toNum <= 0) {
            throw new WrongInputException("You can't use values <= 0");
        }

        if (searchRes == 0) {
            return "\n There is no wagons with declared parameters \n";
        }
        return "\nThe list of wagons with capacity from " + String.valueOf(fromNum) + " to " + String.valueOf(toNum)
                + " passengers\n" + String.valueOf(resultSet);
    }
}
