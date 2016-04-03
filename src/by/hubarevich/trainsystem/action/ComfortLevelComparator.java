package by.hubarevich.trainsystem.action;

import by.hubarevich.trainsystem.entities.CivilWagon;

import java.util.Comparator;

/**
 * Class overrides the compare method of Comparator interface
 */
public class ComfortLevelComparator implements Comparator<CivilWagon> {


    @Override
    public int compare(CivilWagon wagon1, CivilWagon wagon2) {

        return wagon1.getComfortIndex() - wagon2.getComfortIndex();
    }

}
