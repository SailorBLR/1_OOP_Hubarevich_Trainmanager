package by.hubarevich.trainsystem.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anton on 27.11.2015.
 */
public class Train {

    // track

    private static String type;
    private String departStation;
    private String arrivingStation;
    private int trainId;
    private Locomotive locomotive;
    private RestaurantWagon restaurant;
    // list of wagons
    private List<CivilWagon> wagonsCivil = new ArrayList<>();


    //civil train
    public Train(int trainId, String departStation, String arrivingStation,
                 Locomotive locomotive, List<CivilWagon> wagons, RestaurantWagon restaurantWag) {
        this.departStation = departStation;
        this.arrivingStation = arrivingStation;
        this.trainId = trainId;
        this.wagonsCivil = wagons;
        this.locomotive = locomotive;
        this.restaurant = restaurantWag;


        this.type = "CIVIL";

    }

    //cargo train
    public Train(int TrainId, String departStation, String arrivingStation,
                 Locomotive locomotive, List<CargoWagon> wagons) {


        this.type = "CARGO";

    }


    public void addWagon(CivilWagon wagon) {

        this.wagonsCivil.add(wagon);
    }

    public void removeWagon(int number) {

        this.wagonsCivil.remove(number);

    }

    public String getDepartStation() {
        return departStation;
    }

    public String getArrivingStation() {
        return arrivingStation;
    }

    public static String getType() {
        return type;
    }

    public List<CivilWagon> getWagons() {
        return wagonsCivil;
    }

    public int getTrainId() {
        return trainId;
    }

    public Locomotive getLocomotive() {
        return locomotive;
    }


    @Override
    public String toString() {
        return "This train's ID: " + String.valueOf(trainId) + ".\n" +
                "The track is from " + String.valueOf(departStation) + " to " + String.valueOf(arrivingStation) + ".\n" +
                "Locomotive summary: \n" + String.valueOf(locomotive.toString()) + "\n" +
                "total wagons quantity: " + String.valueOf(wagonsCivil.size());
    }
}
