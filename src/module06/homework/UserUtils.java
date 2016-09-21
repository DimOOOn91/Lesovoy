package module06.homework;

import java.util.Arrays;

public class UserUtils {

    public static User[] uniqueUsers(User[] users) {
        int counter = 0;
        for (int i = users.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (users[i].equals(users[j])) {
                    counter++;
                    users[i] = users[users.length - counter];
                    users[users.length - counter] = null;
                    break;
                }
            }
        }

        return users;
    }

    public static User[] usersWithConditionalBalance(User[] users, int balance) {
        int counter = 0;
        for (User user : users) {
            if (user != null && user.getBalance() == balance) {
                counter++;
            }
        }

        User[] usersWithConditionalBalance = new User[counter];
        counter = 0;

        for (User user : users) {
            if (user != null && user.getBalance() == balance) {
                usersWithConditionalBalance[counter++] = user;
            }
        }
        return usersWithConditionalBalance;
    }

    public static final User[] paySalaryToUsers(User[] users) {
        for (User user : users) {
            if(user != null) {
                user.setBalance(user.getBalance() + user.getSalary());
            }
        }
        return users;
    }

    public static final long[] getUsersId(User[] users) {
        long[] usersId = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                usersId[i] = users[i].getId();
            } else {
                usersId[i] = 0;
            }
        }
        return usersId;
    }

    public static User[] deleteEmptyUsers(User[] users) {
        int counter = 0;
        for (int i = users.length - 1; i >= 0; i--) {
            if (users[i] == null) {
                counter++;
                users[i] = users[users.length - counter];
                users[users.length - counter] = null;
            }
        }

        User[] revisedUsers = Arrays.copyOf(users, users.length - counter);

        return revisedUsers;
    }
}
