package module07.homework;

import module07.homework.comperators.ComperatorByItemShopAndCity;
import module07.homework.comperators.DecreaseOrderComparator;
import module07.homework.comperators.IncreaseOrderComparator;

import java.util.ArrayList;
import java.util.List;

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

        list.add(new Order(1L, 1000, Currency.USD, "Guitar", "Nota", user1));
        list.add(new Order(2L, 1500, Currency.UAH, "Hoodie", "Snowborder", user2));
        list.add(new Order(3L, 300, Currency.USD, "Sneakers", "Extrem Style", user3));
        list.add(new Order(4L, 400, Currency.UAH, "Strings", "Nota", user4));
        list.add(new Order(5L, 500, Currency.USD, "Trip", "TUI", user5));
        list.add(new Order(6L, 500, Currency.USD, "Bumper", "Hyundai Auto Center", user6));
        list.add(new Order(7L, 400, Currency.USD, "Bicycle wheel", "Extrem Style", user7));
        list.add(new Order(8L, 300, Currency.USD, "Sneakers", "Extrem Style", user8));
        list.add(new Order(9L, 1580, Currency.UAH, "Trousers", "Voronin", user9));
        list.add(new Order(10L, 2500, Currency.UAH, "Snickers", "Novus", user10));
        list.add(new Order(10L, 2500, Currency.UAH, "Snickers", "Novus", user10));

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
        unicList(list);

        System.out.println(list);

        System.out.println("Remove orders if the price less than 1500:");
        removeByPrice(list, 1500);

        System.out.println(list);

        System.out.println("Separate list for USD and UAH:");
        List<List<Order>> listByUsdUah = new ArrayList<>();
        separateListByCurrency(list, listByUsdUah);

        System.out.println(listByUsdUah);

        System.out.println("Separate list as many unique cities are in User:");
        List<List<Order>> listByCities = new ArrayList<>();
        separateListByCity(list, listByCities);

        System.out.println(listByCities);


    }

    public static void unicList(List<Order> list) {
        int duplicate = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(list.get(j));
                    duplicate++;
                }
            }
        }
        System.out.println("Were found " + duplicate + " duplicates.");
    }

    public static void removeByPrice(List<Order> list, int criticalPrice) {
        for (int i = 0; i < list.size(); i++) {
            Order order = list.get(i);
            if (order.getPrice() < criticalPrice) {
                list.remove(order);
                i--;
            }
        }
    }

    public static void separateListByCurrency(List<Order> originalList, List<List<Order>> separatedList) {
        outer:
        for (Order order : originalList) {
            for (int i = 0; i < separatedList.size(); i++) {
                Order separatedOrder = separatedList.get(i).get(0);
                if (order.getCurrency() == separatedOrder.getCurrency()) {
                    separatedList.get(i).add(order);
                    continue outer;
                }
            }
            separatedList.add(new ArrayList<>());
            separatedList.get(separatedList.size() - 1).add(order);
        }
    }

    public static void separateListByCity(List<Order> originalList, List<List<Order>> separatedList) {
        outer:
        for (Order order : originalList) {
            for (int i = 0; i < separatedList.size(); i++) {
                User originalUser = order.getUser();
                User userOfSeparatedOrder = separatedList.get(i).get(0).getUser();
                if (originalUser.getCity().equals(userOfSeparatedOrder.getCity())) {
                    separatedList.get(i).add(order);
                    continue outer;
                }
            }
            separatedList.add(new ArrayList<>());
            separatedList.get(separatedList.size() - 1).add(order);
        }
    }
}
