package net.braniumacademy.ex623;

public class InvalidSalaryException extends Exception {
    private float invalidSalary;

    public InvalidSalaryException() {
    }

    public InvalidSalaryException(float invalidSalary) {
        this.invalidSalary = invalidSalary;
    }

    public InvalidSalaryException(String message, float invalidSalary) {
        super(message);
        this.invalidSalary = invalidSalary;
    }

    public float getInvalidSalary() {
        return invalidSalary;
    }
}
