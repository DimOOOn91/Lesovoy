package module06.homework;

import java.util.Arrays;

public class UserUtils {

    public static User[] uniqueUsers(User[] users) {
        users = deleteEmptyUsers(users);
        User[] result = new User[0];
        for (User user : users) {
            boolean isContain = isContain(result, user);
            if (!isContain) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = user;
            }
        }
        return result;
    }

    private static boolean isContain(User[] result, User user) {
        for (User key : result) {
            if (key.equals(user)) {
                return true;
            }
        }
        return false;
    }

    public static User[] usersWithConditionalBalance(User[] users, int balance) {
        users = uniqueUsers(users);
        User[] result = new User[0];
        for (User user : users) {
            if (user.getBalance() == balance) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = user;
            }
        }
        return result;
    }

    public static final User[] paySalaryToUsers(User[] users) {
        users = uniqueUsers(users);
        for (User user : users) {
            user.setBalance(user.getBalance() + user.getSalary());
        }
        return users;
    }

    public static final long[] getUsersId(User[] users) {
        users = uniqueUsers(users);
        long[] usersId = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            usersId[i] = users[i].getId();
        }
        return usersId;
    }

    public static User[] deleteEmptyUsers(User[] users) {
        User[] result = new User[0];
        for (User user : users) {
            if (user != null) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = user;
            }
        }
        return result;
    }
}
