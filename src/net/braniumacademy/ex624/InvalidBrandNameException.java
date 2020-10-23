package net.braniumacademy.ex624;

public class InvalidBrandNameException extends Exception {
    private String invalidBrand;

    public InvalidBrandNameException() {
    }

    public InvalidBrandNameException(String invalidBrand) {
        this.invalidBrand = invalidBrand;
    }

    public InvalidBrandNameException(String message, String invalidBrand) {
        super(message);
        this.invalidBrand = invalidBrand;
    }

    public String getInvalidBrand() {
        return invalidBrand;
    }
}
