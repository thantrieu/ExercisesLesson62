package net.braniumacademy.ex625.exceptions;

public class InvalidDateFormatException extends Exception {
    private String invalidDateForm;

    public InvalidDateFormatException() {
    }

    public InvalidDateFormatException(String invalidDateForm) {
        this.invalidDateForm = invalidDateForm;
    }

    public InvalidDateFormatException(String message, String invalidDateForm) {
        super(message);
        this.invalidDateForm = invalidDateForm;
    }

    public String getInvalidDateForm() {
        return invalidDateForm;
    }

    public void setInvalidDateForm(String invalidDateForm) {
        this.invalidDateForm = invalidDateForm;
    }
}
