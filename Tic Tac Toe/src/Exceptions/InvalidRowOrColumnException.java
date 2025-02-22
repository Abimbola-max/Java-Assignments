package Exceptions;

public class InvalidRowOrColumnException extends RuntimeException {
    public InvalidRowOrColumnException(String message) {
        super(message);
    }
}
