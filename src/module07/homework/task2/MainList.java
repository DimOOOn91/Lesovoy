package module07.homework.task2;

import module07.homework.task1.Order;
import module07.homework.task1.User;
import module07.homework.task1.comperators.ComperatorByItemShopAndCity;
import module07.homework.task1.comperators.DecreaseOrderComparator;
import module07.homework.task1.comperators.IncreaseOrderComparator;

import java.util.*;

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

        List<Order> list = new ArrayList<>();

        list.add(new Order(1L, 1000, module07.homework.task1.Currency.USD, "Guitar", "Nota", user1));
        list.add(new Order(2L, 1500, module07.homework.task1.Currency.UAH, "Hoodie", "Snowborder", user2));
        list.add(new Order(3L, 300, module07.homework.task1.Currency.USD, "Sneakers", "Extrem Style", user3));
        list.add(new Order(4L, 400, module07.homework.task1.Currency.UAH, "Strings", "Nota", user4));
        list.add(new Order(5L, 500, module07.homework.task1.Currency.USD, "Trip", "TUI", user5));
        list.add(new Order(6L, 500, module07.homework.task1.Currency.USD, "Bumper", "Hyundai Auto Center", user6));
        list.add(new Order(7L, 400, module07.homework.task1.Currency.USD, "Bicycle wheel", "Extrem Style", user7));
        list.add(new Order(8L, 300, module07.homework.task1.Currency.USD, "Sneakers", "Extrem Style", user8));
        list.add(new Order(9L, 1580, module07.homework.task1.Currency.UAH, "Trousers", "Voronin", user9));
        list.add(new Order(10L, 2500, module07.homework.task1.Currency.UAH, "Snickers", "Novus", user10));
        list.add(new Order(10L, 2500, module07.homework.task1.Currency.UAH, "Snickers", "Novus", user10));

        System.out.println("Decrease Sort:");
        list.sort(new DecreaseOrderComparator());

        System.out.println(list);

        System.out.println("Increase Sort:");
        list.sort(new IncreaseOrderComparator());

        System.out.println(list);

        System.out.println("Sort by itemName, shopIdentificator and User's City:");
        list.sort(new ComperatorByItemShopAndCity());

        System.out.println(list);

        System.out.println("Delete duplicates:");
//        List<Order> newList = new ArrayList<>(new LinkedHashSet<>(list));
        uniqueList(list);

        System.out.println(list);

        System.out.println("Remove orders if the price less than 1500:");
        removeByPrice(list, 150);

        System.out.println(list);

        System.out.println("Separate list for USD and UAH:");

        Map<module07.homework.task1.Currency, List<Order>> separateListByCurrency = separateListByCurrency(list);

        System.out.println(separateListByCurrency);

        System.out.println("Separate list as many unique cities are in User:");
        Map<String, List<Order>> separateListByCity = separateListByCity(list);
        System.out.println(separateListByCity);


    }

    public static void uniqueList(List<Order> orders) {
        List<Order> unique = new ArrayList<>();
        Iterator<Order> iterator = orders.iterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            if (!unique.contains(order)) {
                unique.add(order);
            }
        }
        orders.clear();
        orders.addAll(unique);
/*
      //Bad practice
        int duplicate = 0;
        for (int i = 0; i < orders.size(); i++) {
            for (int j = i + 1; j < orders.size(); j++) {
                if (orders.get(i).equals(orders.get(j))) {
                    orders.remove(orders.get(j));
                    duplicate++;

                }
            }
        }
        System.out.println("Were found " + duplicate + " duplicates.");*/
    }

    public static void removeByPrice(List<Order> orders, int criticalPrice) {
        Iterator<Order> iterator = orders.iterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            if (order.getPrice() < criticalPrice) {
                iterator.remove();
            }
        }

        //Bad practice
        /*for (int i = 0; i < orders.size(); i++) {
            Order order = orders.get(i);
            if (order.getPrice() < criticalPrice) {
                orders.remove(order);
                i--;
            }
        }*/
    }

    public static Map<module07.homework.task1.Currency, List<Order>> separateListByCurrency(List<Order> orders) {
        Map<module07.homework.task1.Currency, List<Order>> result = new HashMap<>();
        for (Order order : orders) {
            module07.homework.task1.Currency currency = order.getCurrency();
            if (result.containsKey(currency)) {
                result.get(currency).add(order);
            } else {
                List<Order> resultOrders = new ArrayList<>();
                resultOrders.add(order);
                result.put(currency, resultOrders);
            }
        }
        return result;
    }

    public static Map<String, List<Order>> separateListByCity(List<Order> orders) {
        Map<String, List<Order>> result = new HashMap<>();
        for (Order order : orders) {
            User user = order.getUser();
            String city = user.getCity();
            if (result.containsKey(city)) {
                result.get(city).add(order);
            } else {
                List<Order> resultOrders = new ArrayList<>();
                resultOrders.add(order);
                result.put(city, resultOrders);
            }
        }
        return result;
    }

/*    public static void separateListByCity(List<Order> originalList) {
        List<List<Order>> result = new ArrayList<>();
        outer:
        for (Order order : originalList) {
            for (int i = 0; i < result.size(); i++) {
                User originalUser = order.getUser();
                User userOfSeparatedOrder = result.get(i).get(0).getUser();
                if (originalUser.getCity().equals(userOfSeparatedOrder.getCity())) {
                    result.get(i).add(order);
                    continue outer;
                }
            }
            result.add(new ArrayList<>());
            result.get(result.size() - 1).add(order);
        }
    }*/
}
