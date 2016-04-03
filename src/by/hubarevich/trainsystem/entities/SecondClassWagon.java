package by.hubarevich.trainsystem.entities;

/**
 * Created by Anton on 27.11.2015.
 */
public class SecondClassWagon extends CivilWagon {

    private int comfortIndex = 2;
    private int tvUnits;

    public SecondClassWagon(String baseStation, int passengersQuantity, int ticketCost, int cargoPlaces, int tvUnits) {
        super(baseStation, passengersQuantity, ticketCost, cargoPlaces);
        this.tvUnits = tvUnits;
    }

    public int getTvUnits() {
        return tvUnits;
    }


    @Override
    public String toString() {
        return "\n Second Class wagon. Wagon ID: " + String.valueOf(getCivilWagonId() + ". Can carry "
                + String.valueOf(getPassengersQuantity()) + " passengers with " + String.valueOf(getCargoPlaces()))
                + " luggage units. " +
                "Ticket cost: " + String.valueOf(getTicketCost()) + ". There are " + String.valueOf(tvUnits)
                + " TV units in wagon \n";
    }
}
