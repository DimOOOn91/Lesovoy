package module09.homework.task1.module7.task1.comperators;

import module09.homework.task1.module7.task1.Order;

public class ComperatorByItemShopAndCity {

    public static int compare(Order order1, Order order2) {
        int result = order1.getItemName().compareTo(order2.getItemName());
        if (result != 0) {
            return result;
        }
        result = order1.getShopIdentificator().compareTo(order2.getShopIdentificator());
        if (result != 0) {
            return result;
        }
        return order1.getUser().getCity().compareTo(order2.getUser().getCity());
    }
}



