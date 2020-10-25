package net.braniumacademy.ex625.comparator;

import net.braniumacademy.ex625.Employee;

import java.util.Comparator;

// sắp xếp nhân viên theo kinh nghiệm giảm dần
public class SortByExperienceDESC implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o2.getExperience() < o1.getExperience()) {
            return -1;
        }
        if (o2.getExperience() > o1.getExperience()) {
            return 1;
        }
        return 0;
    }
}
