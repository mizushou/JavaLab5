package ca.ciccc.exception;

/**
 * Thrown when an argument is grater than 2017.
 *
 * @author shouhei
 * @since 2018-04-24
 */
public class InvalidBookDateException extends Exception {

    public InvalidBookDateException(String message) {
        super(message);
    }

}
