package by.hubarevich.trainsystem.entities;

/**
 * Created by Anton on 27.11.2015.
 */
public class ThirdClassWagon extends CivilWagon {

    private final int COMFORT_INDEX = 3;

    public ThirdClassWagon(String baseStation, int passengersQuantity, int ticketCost, int cargoPlaces) {
        super(baseStation, passengersQuantity, ticketCost, cargoPlaces);
    }


    @Override
    public String toString() {
        return "\n Third Class wagon. Wagon ID: " + String.valueOf(getCivilWagonId() + ". Can carry "
                + String.valueOf(getPassengersQuantity()) + " passengers with " + String.valueOf(getCargoPlaces())) +
                " luggage units. Ticket cost: " + String.valueOf(getTicketCost()) + ". \n";
    }
}
