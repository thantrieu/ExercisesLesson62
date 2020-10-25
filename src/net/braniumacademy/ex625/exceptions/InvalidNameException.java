package net.braniumacademy.ex625.exceptions;

public class InvalidNameException extends Exception {
    private String invalidName;

    public InvalidNameException() {
    }

    public InvalidNameException(String invalidName) {
        this.invalidName = invalidName;
    }

    public InvalidNameException(String message, String invalidName) {
        super(message);
        this.invalidName = invalidName;
    }

    public String getInvalidName() {
        return invalidName;
    }

    public void setInvalidName(String invalidName) {
        this.invalidName = invalidName;
    }
}
