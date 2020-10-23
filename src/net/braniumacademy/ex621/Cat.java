package net.braniumacademy.ex621;

public class Cat {
    private String color;
    private int age;
    private String petName;
    private String favoriteFood;

    public Cat() {
    }

    public Cat(String petName) {
        this.petName = petName;
    }

    public Cat(String color, int age, String petName, String favoriteFood)
            throws InvalidAgeException {
        this.color = color;
        this.setAge(age);
        this.petName = petName;
        this.favoriteFood = favoriteFood;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age > 0 && age <= 50) {
            this.age = age;
        } else {
            this.age = 0;
            var msg = "Tuổi không hợp lệ: " + age;
            throw new InvalidAgeException(msg, age);
        }
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }
}
