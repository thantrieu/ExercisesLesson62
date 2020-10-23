package net.braniumacademy.ex624.comparator;

import net.braniumacademy.ex624.Smartphone;

import java.util.Comparator;

// sắp xếp theo giá tăng dần
public class SortByPriceASC implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        if (o1.getPrice() < o2.getPrice()) {
            return -1;
        }
        if (o1.getPrice() == o2.getPrice()) {
            return 0;
        }
        return 1;
    }
}
