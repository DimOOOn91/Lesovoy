package module08.homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       /* AbstractDAO<String> dao = new DAO<>();
        dao.save(null);
        dao.save("AAA");
        dao.save(null);
        dao.save("BBB");
        dao.save("123");

        System.out.println(dao);

        dao.delete("CCC");
        dao.delete(null);
        dao.delete("BBB");

        System.out.println(dao);

        List<String> list = new ArrayList<>();
        list.add("CCC");
        list.add("VVV");
        list.add(null);

        dao.saveAll(list);
        System.out.println(dao);

        list.add("DDD");
        list.add("RRR");

        dao.deleteAll(list);
        System.out.println(dao);*/

        DAO<Test> dao = new DAO<>();
        //check "save" method
        dao.save(new Test(1));
        dao.save(new Test(2));
        dao.save(new Test(3));
        dao.save(new Test(4));
        dao.save(new Test(5));

        dao.save(new Test(1));
        dao.save(new Test(3));
        dao.save(new Test(5));

        System.out.println(dao + "\n");

        //check "saveAll" method
        List<Test> testList = new LinkedList<>();
        testList.add(new Test(6));
        testList.add(new Test(4));
        testList.add(new Test(7));
        testList.add(new Test(2));
        testList.add(null);

        dao.saveAll(testList);
        System.out.println(dao + "\n");

        //check "delete" method
        dao.delete(new Test(6));
        dao.delete(new Test(1));
        dao.delete(new Test(13));
        System.out.println(dao + "\n");

        //check "deleteAll" method
        testList.add(new Test(10));
        testList.add(new Test(15));
        dao.deleteAll(testList);
        System.out.println(dao + "\n");

        //check "deleteById" method
        dao.deleteById(5);
        System.out.println(dao + "\n");

        //check method "get" by ID
        System.out.println(dao.get(0));

        System.out.println("\n\nUserDAO:");

        User user1 = new User("Dima");
        User user2 = new User("Alex");
        User user3 = new User("Ivan");
        User user4 = new User("Andrey");
        User user5 = new User("Viktor");
        User user6 = new User("Olga");
        User user7 = new User("Inna");
        User user8 = new User("Katya");

        //check "save" method for UserDAO
        UserDAO userDAO = new UserDAO();
        userDAO.save(user1);
        userDAO.save(user2);
        userDAO.save(user3);
        userDAO.save(user4);

        userDAO.save(user1);
        userDAO.save(user3);
        userDAO.save(user4);

        System.out.println(userDAO + "\n");

        //check "saveAll" method for UserDAO
        List<User> newUsersList = new LinkedList<>();
        newUsersList.add(user5);
        newUsersList.add(user6);
        newUsersList.add(null);

        userDAO.saveAll(newUsersList);
        System.out.println(userDAO + "\n");

        //check "delete" method for UserDAO
        userDAO.delete(null);
        userDAO.delete(user6);
        userDAO.delete(user7);
        System.out.println(userDAO + "\n");

        //check "deleteAll" method for UserDAO
        newUsersList.add(user7);
        newUsersList.add(user8);
        userDAO.deleteAll(newUsersList);
        System.out.println(userDAO + "\n");

        //check "deleteById" method for UserDAO
        userDAO.deleteById(10004);
        System.out.println(userDAO + "\n");

        //check method "get" by ID for UserDAO
        System.out.println(userDAO.get(10003));


    }
}
