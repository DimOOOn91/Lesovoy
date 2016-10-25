package module07.homework.task1.comperators;

import module07.homework.task1.Order;

import java.util.Comparator;

public class DecreaseOrderComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        return Integer.compare(o2.getPrice(), o1.getPrice());
    }
}
