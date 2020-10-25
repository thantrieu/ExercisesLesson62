package net.braniumacademy.ex625.comparator;

import net.braniumacademy.ex625.Employee;

import java.util.Comparator;

// sắp xếp nhân viên theo kinh nghiệm tăng dần
public class SortByExperienceASC implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getExperience() < o2.getExperience()) {
            return -1;
        }
        if (o1.getExperience() > o2.getExperience()) {
            return 1;
        }
        return 0;
    }
}