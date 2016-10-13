package module08.homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UserDAO implements AbstractDAO<User> {

    List<User> users;

    public UserDAO() {
        users = new ArrayList<>();
    }

    @Override
    public User save(User user) {
        if (user != null && !users.contains(user)) {
            users.add(user);
            return user;
        }
        return null;    }

    @Override
    public void delete(User user) {
        if (users.contains(user)) {
            users.remove(user);
        }
    }

    @Override
    public void deleteAll(List<User> list) {
        list = removeNulls(list);
        if (list.isEmpty()) {
            System.out.println("Your list is empty!");
            return;
        }
        if (users.containsAll(list)) {
            users.removeAll(list);
        } else {
            List<User> notIdentified = new LinkedList<User>();
            for (User user : list) {
                if (!users.contains(user)) {
                    notIdentified.add(user);
                }
                delete(user);
            }
            System.out.println("Following elements have not been found in the DB:\n" + notIdentified);
        }
    }


    private List<User> removeNulls(List<User> list) {
        List<User> result = new LinkedList<>();
        for (User user : list) {
            if (user != null) {
                result.add(user);
            }
        }
        return result;
    }

    @Override
    public void saveAll(List<User> list) {
        if (list.isEmpty() || users.containsAll(list)) {
            return;
        }
        for (User user : list) {
            save(user);
            save(user);
        }
    }

    @Override
    public List<User> getDataBase() {
        return users;
    }

    @Override
    public void deleteById(long id) {
        if (id == 0) {
            return;
        }
        for (User user : users) {
            if (user.getId() == id) {
                users.remove(user);
                return;
            }
        }
    }

    @Override
    public User get(long id) {
        if (id == 0) {
            return null;
        }
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
}
