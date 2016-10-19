package module08.homework;

import java.util.LinkedList;
import java.util.List;

public class UserDAO extends DAO<User> {

    List<User> users;

    public UserDAO() {
        users = new LinkedList<>();
    }


    public User save(User element) {
        return super.save(element);
    }

    public void delete(User element) {
        super.delete(element);
    }

    public void deleteAll(List<User> list) {
        super.deleteAll(list);
    }

    public void saveAll(List<User> list) {
        super.saveAll(list);
    }

    public void deleteById(long id) {
        super.deleteById(id);
    }

    public User get(long id) {
        return super.get(id);
    }



//    @Override
//    public User save(User user) {
//        if (user == null || users.contains(user)) {
//            System.out.println("This User cannot be saved");
//            return null;
//        }
//        users.add(user);
//        System.out.println("Following User was saves successfully: " + user);
//        return user;
//    }
//
//    @Override
//    public void delete(User user) {
//        if (users.contains(user)) {
//            users.remove(user);
//            System.out.println("Following User was saves successfully: " + user);
//        } else {
//            System.out.println(user + " has not been found.");
//        }
//    }
//
//    @Override
//    public void deleteAll(List<User> list) {
//        list = removeNulls(list);
//        if (list.isEmpty()) {
//            System.out.println("Your list is empty!");
//            return;
//        }
//        if (users.containsAll(list)) {
//            users.removeAll(list);
//            System.out.println("All Users in the list were deleted successfully.");
//            return;
//        }
//        for (User user : list) {
//            delete(user);
//        }
//    }
//
//    private List<User> removeNulls(List<User> list) {
//        List<User> result = new LinkedList<>();
//        for (User user : list) {
//            if (user != null) {
//                result.add(user);
//            }
//        }
//        return result;
//    }
//
//    @Override
//    public void saveAll(List<User> list) {
//        if (users.containsAll(list)) {
//            System.out.println("The Users are already in DB.");
//            return;
//        }
//        for (User user : list) {
//            save(user);
//        }
//    }
//
//    @Override
//    public void deleteById(long id) {
//        if (id == 0) {
//            System.out.println("Please check the ID.");
//            return;
//        }
//        for (User user : users) {
//            if (user.getId() == id) {
//                delete(user);
//                return;
//            }
//        }
//    }
//
//    @Override
//    public User get(long id) {
//        if (id == 0) {
//            return null;
//        }
//        for (User user : users) {
//            if (user.getId() == id) {
//                return user;
//            }
//        }
//        System.out.println("User with id " + id + " has not been found");
//        return null;
//    }
//
    @Override
    public List<User> getDataBase() {
        return super.getDataBase();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserDAO{");
        sb.append("users=").append(getDataBase());
        sb.append('}');
        return sb.toString();
    }
}
