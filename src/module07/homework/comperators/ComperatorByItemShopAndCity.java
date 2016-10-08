package module07.homework.comperators;

import module07.homework.Order;

import java.util.Comparator;

public class ComperatorByItemShopAndCity implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        int result = o1.getItemName().compareTo(o2.getItemName());
        if (result == 0) {
            result = o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
            if (result == 0) {
                result = o1.getUser().getCity().compareTo(o2.getUser().getCity());
            }
        }
        return result;
    }
}


