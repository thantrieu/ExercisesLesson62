package net.braniumacademy.ex625.comparator;

import net.braniumacademy.ex625.Employee;

import java.util.Comparator;

// sắp xếp nhân viên theo tuổi tăng dần
public class SortByAgeASC implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o2.getDateOfBirth().getTime() < o1.getDateOfBirth().getTime()) {
            return -1;
        }
        if (o2.getDateOfBirth().getTime() > o1.getDateOfBirth().getTime()) {
            return 1;
        }
        return 0;
    }
}