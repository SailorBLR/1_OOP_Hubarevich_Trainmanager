package by.hubarevich.trainsystem.util;

/**
 * Util Class for generating ID
 * Created by Anton on 02.12.2015.
 */
public class IdGenerator {

    public static int generatedId = 1;

    public static int  generateId () {


        return generatedId++;
    }
}
