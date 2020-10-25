package net.braniumacademy.ex625.exceptions;

public class InvalidWorkingDayException extends Exception {
    private float invalidWorkingDay;

    public InvalidWorkingDayException() {
    }

    public InvalidWorkingDayException(float invalidWorkingDay) {
        this.invalidWorkingDay = invalidWorkingDay;
    }

    public InvalidWorkingDayException(String message, float invalidWorkingDay) {
        super(message);
        this.invalidWorkingDay = invalidWorkingDay;
    }

    public float getInvalidWorkingDay() {
        return invalidWorkingDay;
    }

    public void setInvalidWorkingDay(float invalidWorkingDay) {
        this.invalidWorkingDay = invalidWorkingDay;
    }
}
