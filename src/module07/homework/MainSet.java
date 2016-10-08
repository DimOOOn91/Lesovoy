package module07.homework;

import java.util.*;

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

        TreeSet<Order> orders = new TreeSet<>();

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
        System.out.println(isContain(orders, "Petrov"));

        System.out.println("\nPrint Order with largest price using only one set method - get:");
        System.out.println(orders.last());

        System.out.println("\nDelete orders where currency is USD using Iterator:");
        Iterator<Order> ordersIterator = orders.iterator();
        removeOrdersByCurrency(ordersIterator, Currency.USD);

        System.out.println(orders);


    }

    public static void removeOrdersByCurrency(Iterator<Order> iterator, Currency currency) {
        while (iterator.hasNext()) {
            Order order = iterator.next();
            if (order.getCurrency() == currency) {
                iterator.remove();
            }
        }
    }

    public static boolean isContain(Set<Order> set, String lastName) {
        for (Order order : set) {
            User user = order.getUser();
            if (user.getLastName() == lastName) {
                return true;
            }
        }
        return false;
    }
}
