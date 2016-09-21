package module06.homework;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User[] users = {
                new User(1111L, "Irina", "Kovalenko", 5000, 20_000),
                new User(1112L, "Vikotr", "Chyzh", 6000, 10_000),
                new User(1113L, "Inna", "Zinchenko", 5500, 15_000),
                new User(1114L, "Pavel", "Popov", 4800, 0),
                new User(1111L, "Irina", "Kovalenko", 5000, 20_000),
                new User(1115L, "Olga", "Petrova", 7000, 5_000),
                new User(1114L, "Pavel", "Popov", 4800, 0),
                new User(1116L, "Tatiana", "Kovalenko", 5555, 20_000),
                new User(1115L, "Olga", "Petrova", 7000, 5_000),
                new User(1117L, "Roman", "Petrenko", 5000, 15_000),
        };

        for (User user : users) {
            System.out.println(user);
        }

        System.out.println("\n" + "Unique Users:");

        User[] uniqueUsers = UserUtils.uniqueUsers(users);

        for (User user : uniqueUsers) {
            System.out.println(user);
        }
        System.out.println("\n" + "Delete empty:");
        System.out.println(Arrays.toString(UserUtils.deleteEmptyUsers(users)));

        System.out.println("\n" + "Pay salary to users with balance 20_000:");

        System.out.println("Before payment: " + Arrays.toString(users));
        UserUtils.paySalaryToUsers(UserUtils.usersWithConditionalBalance(users, 20_000));
        System.out.println("After payment: " + Arrays.toString(users));

        System.out.println("\n" +"Get ID from users with balance 15_000:");
        User[] usersWithConditionalBalance = UserUtils.usersWithConditionalBalance(users, 15_000);
        System.out.println(Arrays.toString(UserUtils.getUsersId(usersWithConditionalBalance)));

    }
}
