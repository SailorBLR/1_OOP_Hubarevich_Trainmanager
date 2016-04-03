package by.hubarevich.trainsystem.entities;

import java.util.List;
import java.util.Map;

/**
 * Created by Anton on 27.11.2015.
 */
public class RestaurantWagon extends CivilWagon {

    private int guests;
    private Map<String, List> menu;


    public RestaurantWagon(String baseStation, int passengersQuantity, Map<String, List> menu) {
        super(baseStation, passengersQuantity);
        this.guests = passengersQuantity;
        this.menu = menu;
    }

    public int getGuests() {
        return guests;
    }

    public Map<String, List> getMenu() {
        return menu;
    }


    @Override
    public String toString() {
        return String.valueOf(guests) + " guests can visit restaurant.";
    }
}
