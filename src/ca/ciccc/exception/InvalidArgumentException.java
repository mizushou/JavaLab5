package ca.ciccc.exception;

/**
 * Thrown when an argument is null or an empty string.
 *
 * @author shouhei
 * @since 2018-04-24
 */
public class InvalidArgumentException extends Exception {

    public InvalidArgumentException(String message) {
        super(message);
    }

}
