package by.hubarevich.trainsystem.creator;

import by.hubarevich.trainsystem.entities.*;
import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Class creates all instances of CivilWagons
 * Data input from file properties.xml
 */
public class CivilWagonCreator {

    private static final Logger LOG = Logger.getLogger(CivilWagonCreator.class);
    private static Properties properties;

    /**
     * Method performs reading from properties file
     * @return object Properties
     */

    private static Properties dataFileReader (String propertyFile) {
        try {

            properties = new Properties();
            FileInputStream inputStream = new FileInputStream(propertyFile);
            properties.loadFromXML(inputStream);
        } catch (FileNotFoundException e) {
            LOG.error(e);
        } catch (IOException e ) {
            LOG.error(e);
        }
        return properties;
    }
    /**
     * Parameters for FirstClass wagon
     */
    public CivilWagon createFirstClassWagon(String propertyFile) {
        dataFileReader(propertyFile);

        return new FirstClassWagon(properties.getProperty("firstClassBase"),
                Integer.valueOf(properties.getProperty("firstClassPassengers")),
                Integer.valueOf(properties.getProperty("firstClassCost")),
                Integer.valueOf(properties.getProperty("firstClassCargo")),
                Integer.valueOf(properties.getProperty("firstClassWifi")));
    }


    /**
     * Parameters for SecondClass wagon
     */

    public CivilWagon createSecondClassWagon(String propertyFile) {
        dataFileReader(propertyFile);
        return new SecondClassWagon(properties.getProperty("firstClassBase"),
                Integer.valueOf(properties.getProperty("secondClassPassengers")),
                Integer.valueOf(properties.getProperty("secondClassCost")),
                Integer.valueOf(properties.getProperty("secondClassCargo")),
                Integer.valueOf(properties.getProperty("secondClassTv")));
    }

    /**
     *
     * Parameters for ThirdClass wagon
     */


    public CivilWagon createThirdClassWagon(String propertyFile) {
        dataFileReader(propertyFile);
        return new ThirdClassWagon(properties.getProperty("thirdClassBase"),
                Integer.valueOf(properties.getProperty("thirdClassPassengers")),
                Integer.valueOf(properties.getProperty("thirdClassCost")),
                Integer.valueOf(properties.getProperty("thirdClassCargo")));
    }

    /**
     *
     * @param baseStation
     * @param passengersQuantity
     * @param menu
     * @return
     * Restaurant wagon parameters
     */

    public CivilWagon createRestaurantWagon(String baseStation, int passengersQuantity, Map<String, List> menu) {

        return new RestaurantWagon(baseStation, passengersQuantity, menu);
    }
}
