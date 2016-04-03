package by.hubarevich.trainsystem.entities;

/**
 * Created by Anton on 27.11.2015.
 */
public class FirstClassWagon extends CivilWagon {


    private int comfortIndex = 1;
    private int wiFiPassword;

    public FirstClassWagon(String baseStation, int passengersQuantity, int ticketCost, int cargoPlaces, int wiFiPassword) {
        super(baseStation, passengersQuantity, ticketCost, cargoPlaces);
        this.wiFiPassword = wiFiPassword;
    }

    public int getWiFiPassword() {
        return wiFiPassword;
    }

    @Override
    public String toString() {
        return "\n First Class wagon. Wagon ID: " + String.valueOf(getCivilWagonId() + ". Can carry "
                + String.valueOf(getPassengersQuantity()) + " passengers with " + String.valueOf(getCargoPlaces())) + " luggage units. " +
                "Ticket cost: " + String.valueOf(getTicketCost()) + ". Passenger can get WiFi Internet access. Password: " +
                Integer.toString(wiFiPassword) + "\n";
    }
}
