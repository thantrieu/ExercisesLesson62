package net.braniumacademy.ex623;

import java.time.LocalDate;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập họ và tên giảng viên: ");
        var fullName = input.nextLine();
        System.out.println("Nhập mức lương: ");
        // nhập vào mức lương và loại bỏ khoảng trắng đầu cuối nếu có
        var salaryStr = input.nextLine().trim();
        Instructor instructor = new Instructor();
        instructor.setFullName(fullName);

        var salary = Long.parseLong(salaryStr);
        try {
            instructor.setSalary(salary);
            System.out.println("Thiết lập mức lương thành công!");
        } catch (InvalidSalaryException e) {
            e.printStackTrace();
            System.out.println("Thiết lập mức lương thất bại!");
        }

        // hiển thị thông tin lương giảng viên
        showInfo(instructor);
    }

    private static void showInfo(Instructor instructor) {
        System.out.println("==================================");
        System.out.println("Tên giảng viên: " + instructor.getFullName());
        System.out.println("Mức lương: " + instructor.getSalary());
    }
}
