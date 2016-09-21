package module06.homework;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(1111L, "Irina", "Kovalenko", 5000, 20_000);
        User user2 = new User(1112L, "Vikotr", "Chyzh", 6000, 10_000);
        User user3 = new User(1113L, "Inna", "Zinchenko", 5500, 15_000);
        User user4 = new User(1114L, "Pavel", "Popov", 4800, 0);
        User user5 = new User(1115L, "Olga", "Petrova", 7000, 5_000);

        User[] users = {user1, user2, user3, user4, null, user5, user1, user4, user5, null, null};

        System.out.println(Arrays.toString(users));

        System.out.println("\n" + "Delete empty:");
        System.out.println(Arrays.toString(UserUtils.deleteEmptyUsers(users)));

        System.out.println("\n" + "Unique Users:");
        User[] uniqueUsers = UserUtils.uniqueUsers(users);
        System.out.println(Arrays.toString(uniqueUsers));

        System.out.println("\n" + "Pay salary to users with balance 20_000:");

        UserUtils.paySalaryToUsers(users);
        System.out.println("After payment: " + Arrays.toString(users));

        System.out.println("\n" + "Get ID from users with balance 15_000:");
        System.out.println(Arrays.toString(UserUtils.getUsersId(users)));


        User[] usersWithConditionalBalance = UserUtils.usersWithConditionalBalance(users, 15_000);
        System.out.println(Arrays.toString(usersWithConditionalBalance));

    }
}
