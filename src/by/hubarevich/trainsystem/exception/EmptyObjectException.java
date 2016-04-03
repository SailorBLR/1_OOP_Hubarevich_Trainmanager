package by.hubarevich.trainsystem.exception;

/**
 * Created by Anton on 26.11.2015.
 */
public class EmptyObjectException extends Exception {

    public EmptyObjectException() {
    }

    public EmptyObjectException(String message) {
        super(message);
    }

    public EmptyObjectException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyObjectException(Throwable cause) {
        super(cause);
    }

    public EmptyObjectException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
