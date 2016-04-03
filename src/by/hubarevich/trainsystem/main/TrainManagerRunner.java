package by.hubarevich.trainsystem.main;

import by.hubarevich.trainsystem.action.ComfortLevelComparator;
import by.hubarevich.trainsystem.action.TrainSummary;
import by.hubarevich.trainsystem.action.WagonSearch;
import by.hubarevich.trainsystem.creator.TrainCreator;
import by.hubarevich.trainsystem.entities.CivilWagon;
import by.hubarevich.trainsystem.entities.Train;
import by.hubarevich.trainsystem.exception.EmptyObjectException;
import by.hubarevich.trainsystem.exception.SameIdException;
import by.hubarevich.trainsystem.exception.WrongInputException;
import org.apache.log4j.Logger;

import java.util.Collections;

/**
 * Class with the static void main
 *
 * @author Hubarevich Anton
 * @version 1.0
 */
public class TrainManagerRunner {


    static final Logger LOG = Logger.getLogger(TrainManagerRunner.class);

    public static void main(String[] args) {
        Integer fromNum = 75, toNum = 100;


        /** Creating the train creator instance
         * and forming the train
         */

        TrainCreator creator = new TrainCreator();
        Train train;
        try {
            train = creator.formPassTrain();
            System.out.println(train.toString());

            TrainSummary summary = new TrainSummary(train);
            System.out.println(summary.luggageSum());
            System.out.println(summary.passSum());

            Collections.sort(train.getWagons(), new ComfortLevelComparator());

            for (CivilWagon wagon : train.getWagons()) {
                System.out.print(wagon);
            }

            WagonSearch search = new WagonSearch();
            System.out.println(search.searchWagon(train.getWagons(),fromNum,toNum));

            /** The list of possible mistakes
             */
        } catch (SameIdException e) {
            LOG.error(e);
        } catch (WrongInputException e) {
            LOG.error(e);
        } catch (EmptyObjectException e) {
            LOG.error(e);
        }


    }
}
