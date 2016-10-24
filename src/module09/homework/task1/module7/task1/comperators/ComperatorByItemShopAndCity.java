package module09.homework.task1.module7.task1.comperators;

import module09.homework.task1.module7.task1.Order;
import module09.homework.task1.module7.task1.User;

public class ComperatorByItemShopAndCity {

    public static int compare(Order o1, Order o2) {
        int result = o1.getItemName().compareTo(o2.getItemName());
        if (result != 0) {
            return result;
        }
        result = o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
        if (result != 0) {
        return result;
        }
        User user1 = o1.getUser();
        User user2 = o2.getUser();
        return user1.getCity().compareTo(user2.getCity());
    }
}



