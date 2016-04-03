package by.hubarevich.trainsystem.exception;

/**
 * Created by Anton on 26.11.2015.
 */
public class SameIdException extends Exception {

    public SameIdException() {
    }

    public SameIdException(String message) {
        super(message);
    }

    public SameIdException(String message, Throwable cause) {
        super(message, cause);
    }

    public SameIdException(Throwable cause) {
        super(cause);
    }

    public SameIdException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
