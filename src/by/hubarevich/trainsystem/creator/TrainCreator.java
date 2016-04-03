package by.hubarevich.trainsystem.creator;

import by.hubarevich.trainsystem.entities.CivilWagon;
import by.hubarevich.trainsystem.entities.Locomotive;
import by.hubarevich.trainsystem.entities.Train;
import by.hubarevich.trainsystem.exception.EmptyObjectException;
import by.hubarevich.trainsystem.exception.SameIdException;
import by.hubarevich.trainsystem.exception.WrongInputException;
import by.hubarevich.trainsystem.util.City;
import by.hubarevich.trainsystem.util.Drivers;
import by.hubarevich.trainsystem.util.IdGenerator;
import by.hubarevich.trainsystem.util.InputDataValidator;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Random;

/**
 * Class creates a Train instance, using wagon and locomotive instances and unique ID.
 */
public class TrainCreator {


    public Train formPassTrain() throws WrongInputException, EmptyObjectException, SameIdException {

        LocomotiveCreator locoCreator = new LocomotiveCreator();
        CivilWagonCreator wagonCreator = new CivilWagonCreator();
        Locomotive locomotive = locoCreator.createDiesel(City.CHICAGO.toString(), 4000, Drivers.BILL_MURRAY.toString());
        List<CivilWagon> wagons = new ArrayList<>();
        InputDataValidator validator;

        for (int i = 0; i <= 3; i++) {

            wagons.add(wagonCreator.createFirstClassWagon("properties.xml"));

        }

        for (int i = 0; i <= 7; i++) {

            wagons.add(wagonCreator.createSecondClassWagon("properties.xml"));

        }

        for (int i = 0; i <= 5; i++) {

            wagons.add(wagonCreator.createThirdClassWagon("properties.xml"));

        }

        Train train = new Train(generateId(), City.CHICAGO.toString(), City.NEW_YORK.toString(),
                locomotive, wagons, null);

        validator = new InputDataValidator(train);

        if (validator.wagonValidator()) {
            return train;
        }
        return null;
    }

    /**
     * ID generator for train. All numbers are between the 1000 and 9999.
     *
     * @return
     */

    private static int generateId() {

        return 1000 + IdGenerator.generatedId;
    }

}
