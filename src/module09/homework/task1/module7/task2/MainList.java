package module09.homework.task1.module7.task2;


import module09.homework.task1.module7.task1.Currency;
import module09.homework.task1.module7.task1.comperators.*;
import module09.homework.task1.module7.task1.Order;
import module09.homework.task1.module7.task1.User;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainList {
    public static void main(String[] args) {
        User user1 = new User(1L, "Andrey", "Naista", "Kiev", 30000);
        User user2 = new User(2L, "Ivan", "Avramov", "Lvov", 15000);
        User user3 = new User(3L, "Olga", "Knysh", "Odessa", 5000);
        User user4 = new User(4L, "Anna", "Pozniak", "Kiev", 600);
        User user5 = new User(5L, "Pavel", "Pivovarov", "Rovno", 9000);
        User user6 = new User(6L, "Elizaveta", "Kismes", "Kiev", 8000);
        User user7 = new User(7L, "Alexandr", "Popov", "Odessa", 1900);
        User user8 = new User(8L, "Daniil", "Kirimov", "Rovno", 4500);
        User user9 = new User(9L, "Stanislav", "Minin", "Rovno", 25000);
        User user10 = new User(10L, "Valentyna", "Petrova", "Odessa", 50);

        List<Order> orders = new ArrayList<>();

        orders.add(new Order(1L, 1000, Currency.USD, "Guitar", "Nota", user1));
        orders.add(new Order(2L, 1500, Currency.UAH, "Hoodie", "Snowborder", user2));
        orders.add(new Order(3L, 300, Currency.USD, "Sneakers", "Extrem Style", user3));
        orders.add(new Order(4L, 400, Currency.UAH, "Strings", "Nota", user4));
        orders.add(new Order(5L, 500, Currency.USD, "Trip", "TUI", user5));
        orders.add(new Order(6L, 500, Currency.USD, "Bumper", "Hyundai Auto Center", user6));
        orders.add(new Order(7L, 400, Currency.USD, "Bicycle wheel", "Extrem Style", user7));
        orders.add(new Order(8L, 300, Currency.USD, "Sneakers", "Extrem Style", user8));
        orders.add(new Order(9L, 1580, Currency.UAH, "Trousers", "Voronin", user9));
        orders.add(new Order(10L, 2500, Currency.UAH, "Sneakers", "Novus", user10));
        orders.add(new Order(10L, 2500, Currency.UAH, "Sneakers", "Novus", user10));

        System.out.println("Sort list by Order price in decrease order:");
//        orders.sort(Comparator.comparing(Order::getPrice).reversed());
        orders.sort(((o1, o2) -> Integer.compare(o2.getPrice(), o1.getPrice())));
//        List<Order> decreaseSortedOrders = orders.stream()
//                .sorted((o1, o2) -> Integer.compare(o2.getPrice(), o1.getPrice()))
//                .collect(Collectors.toList());
        System.out.println(orders);

        System.out.println("Sort list by Order price in increase order AND User city:");
//        List<Order> increaseSortedOrders =
        orders.sort(Comparator.comparing(Order::getPrice).thenComparing(Order::getUserCity));

        System.out.println(orders);

        System.out.println("Sort by itemName, shopIdentificator and User's City:");
        List<Order> ordersSortedByItemShopAndCity = orders;
        ordersSortedByItemShopAndCity.sort(Comparator.comparing(Order::getItemName)
                .thenComparing(Order::getShopIdentificator)
                .thenComparing(Order::getUserCity));
//        List<Order> ordersSortedByItemShopAndCity = orders.stream()
//                .sorted(ComperatorByItemShopAndCity::compare)
//                .collect(Collectors.toList());
        System.out.println(ordersSortedByItemShopAndCity);

        System.out.println("Delete duplicates:");
        List<Order> uniqueOrders = orders.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueOrders);

        System.out.println("Remove orders if the price less than 1500:");
        int price = 1500;
        Predicate<Order> orderPredicate = order -> order.getPrice() > price;
        List<Order> ordersNotCheaperThan = orders.stream()
                .filter(orderPredicate)
                .collect(Collectors.toList());
        System.out.println(ordersNotCheaperThan);

        MainList mainList = new MainList();

        System.out.println("Separate orders for USD and UAH:");
        System.out.println(mainList.separateList(orders, Order::getCurrency));

        System.out.println("Separate orders as many unique cities are in User:");
        System.out.println(mainList.separateList(orders, Order::getUserCity));
    }

    public <T> Map<T, List<Order>> separateList(List<Order> orders, Function<Order, T> function) {
        return orders.stream()
                .collect(Collectors.groupingBy(function));
    }
}
