package module07.homework.comperators;

import module07.homework.Order;

import java.util.Comparator;

public class DecreaseOrderComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        return o2.getPrice() - o1.getPrice();
    }
}
