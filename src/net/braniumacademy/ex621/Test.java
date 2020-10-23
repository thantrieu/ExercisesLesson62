package net.braniumacademy.ex621;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập tên của mèo: ");
        var name = input.nextLine();
        Cat myCat = new Cat(name);
        System.out.println("Nhập tuổi của mèo(số nguyên): ");
        var ageStr = input.nextLine().trim();
        var age = Integer.parseInt(ageStr);
        try {
            myCat.setAge(age);
        } catch (InvalidAgeException e) {
            e.printStackTrace();
            System.out.println("Tuổi hợp lệ phải từ 0-50.");
        }
        showPetInfo(myCat);
    }

    private static void showPetInfo(Cat myCat) {
        System.out.println("==========MEOW==========");
        System.out.println("Pet name: " + myCat.getPetName());
        System.out.println("Age: " + myCat.getAge());
    }
}
