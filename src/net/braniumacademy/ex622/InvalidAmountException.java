package net.braniumacademy.ex622;

public class InvalidAmountException extends Exception {
    private long invalidAmount;

    public InvalidAmountException() {
    }

    public InvalidAmountException(long invalidAmount) {
        this.invalidAmount = invalidAmount;
    }

    public InvalidAmountException(String message, long invalidAmount) {
        super(message);
        this.invalidAmount = invalidAmount;
    }

    public long getInvalidAmount() {
        return invalidAmount;
    }
}
