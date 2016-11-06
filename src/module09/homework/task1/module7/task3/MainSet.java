package module09.homework.task1.module7.task3;


import module09.homework.task1.module7.task1.Currency;
import module09.homework.task1.module7.task1.Order;
import module09.homework.task1.module7.task1.User;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class MainSet {
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
        User user10 = new User(10L, "Valentyn", "Petrov", "Odessa", 50);

        Set<Order> orders = new TreeSet<>();

        orders.add(new Order(1L, 1000, Currency.USD, "Guitar", "Nota", user1));
        orders.add(new Order(2L, 1500, Currency.UAH, "Hoodie", "Snowborder", user2));
        orders.add(new Order(3L, 300, Currency.USD, "Sneakers", "Extrem Style", user3));
        orders.add(new Order(4L, 400, Currency.UAH, "Strings", "Nota", user4));
        orders.add(new Order(5L, 500, Currency.USD, "Trip", "TUI", user5));
        orders.add(new Order(6L, 500, Currency.USD, "Bumper", "Hyundai Auto Center", user6));
        orders.add(new Order(7L, 400, Currency.USD, "Bicycle wheel", "Extrem Style", user7));
        orders.add(new Order(8L, 300, Currency.USD, "Sneakers", "Extrem Style", user8));
        orders.add(new Order(9L, 1580, Currency.UAH, "Trousers", "Voronin", user9));
        orders.add(new Order(10L, 2500, Currency.UAH, "Snickers", "Novus", user10));
        orders.add(new Order(10L, 2500, Currency.UAH, "Snickers", "Novus", user10));

        System.out.println(orders);

        System.out.println("\nCheck if set contain Order where User’s lastName is - “Petrov”:");
        boolean isContain = orders.stream()
                .anyMatch(o -> (o.getUser().getLastName()).equals("Petrov"));
        System.out.println(isContain);

        System.out.println("\nPrint Order with largest price using only one set method - get:");
        Order theMostExpensiveOrder = orders.stream()
                .max((o1, o2) -> Integer.compare(o1.getPrice(), o2.getPrice())).get();
        System.out.println(theMostExpensiveOrder);

        System.out.println("\nDelete orders where currency is USD:");
        Currency currency = Currency.USD;
        List<Order> ordersWithoutUsdCurrency = orders.stream()
                .filter(o -> !o.getCurrency().equals(currency))
                .collect(Collectors.toList());
        System.out.println(ordersWithoutUsdCurrency);

    }
}
