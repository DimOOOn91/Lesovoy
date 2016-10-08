package module07.homework.comperators;

import module07.homework.Order;

import java.util.Comparator;

public class IncreaseOrderComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        String o1UserCity = o1.getUser().getCity();
        String o2UserCity = o2.getUser().getCity();
        return o1.getPrice() == o2.getPrice() ? o1UserCity.compareTo(o2UserCity) : o1.getPrice() - o2.getPrice();
    }
}
