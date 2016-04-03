package by.hubarevich.trainsystem.action;

import by.hubarevich.trainsystem.entities.CivilWagon;
import by.hubarevich.trainsystem.entities.Train;

/**
 * Class performs two searching operations
 * 1. for total luggage capacity
 * 2. for total passengers capacity
 */
public class TrainSummary {

    private int totalSpaces = 0;
    private int totalCargoPlaces = 0;
    private Train train;

    public TrainSummary(Train train) {
        this.train = train;
    }

    public String luggageSum() {
        for (CivilWagon wagon : train.getWagons()) {
            totalCargoPlaces += wagon.getCargoPlaces();
        }
        return "Total luggage capacity: " + String.valueOf(totalCargoPlaces);
    }

    public String passSum() {

        for (CivilWagon wagon : train.getWagons()) {
            totalSpaces += wagon.getPassengersQuantity();
        }

        return "Total passengers capacity: " + String.valueOf(totalSpaces) + "\n";
    }
}
