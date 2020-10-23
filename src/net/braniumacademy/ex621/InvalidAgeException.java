package net.braniumacademy.ex621;

public class InvalidAgeException extends Exception {
    private int invalidAge;

    public InvalidAgeException() {
    }

    public InvalidAgeException(int invalidAge) {
        this.invalidAge = invalidAge;
    }

    public InvalidAgeException(String message, int invalidAge) {
        super(message);
        this.invalidAge = invalidAge;
    }

    public int getInvalidAge() {
        return invalidAge;
    }
}
