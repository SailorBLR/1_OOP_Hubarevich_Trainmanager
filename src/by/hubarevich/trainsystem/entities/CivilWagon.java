package by.hubarevich.trainsystem.entities;


import by.hubarevich.trainsystem.util.IdGenerator;

/**
 * Abstract class for all Civil (passengers) units. All IDs are with 3000 serie.
 */
public abstract class CivilWagon{

    private static final int SERIE = 3000;
    private int civilWagonId;
    private String baseStation;
    private int passengersQuantity;
    private int ticketCost;
    private int cargoPlaces;
    private int comfortIndex;

    public CivilWagon(String baseStation, int passengersQuantity) {
        this.baseStation = baseStation;
        this.passengersQuantity = passengersQuantity;
    }

    public CivilWagon(String baseStation, int passengersQuantity, int ticketCost, int cargoPlaces) {

        this.baseStation = baseStation;
        this.passengersQuantity = passengersQuantity;
        this.ticketCost = ticketCost;
        this.cargoPlaces = cargoPlaces;

        this.civilWagonId =SERIE+IdGenerator.generateId();

    }


    public void setBaseStation(String baseStation) {

        this.baseStation = baseStation;

    }

    public int getPassengersQuantity() {
        return passengersQuantity;
    }

    public int getCivilWagonId() {
        return civilWagonId;
    }

    public String getBaseStation() {
        return baseStation;
    }

    public int getTicketCost() {
        return ticketCost;
    }

    public int getCargoPlaces() {
        return cargoPlaces;
    }

    public int getComfortIndex() {
        return comfortIndex;
    }
}

