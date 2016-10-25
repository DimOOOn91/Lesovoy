package module08.homework;

import java.util.*;

public class DAO<T extends Identity> implements AbstractDAO<T> {

    private Set<T> dataBase;

    public DAO() {
        dataBase = new HashSet<T>();
    }

    @Override
    public T save(T element) {
        if (element == null) {
            System.out.println("The element is null");
            return null;
        }
        dataBase.add(element);
        System.out.println("Following element was saves successfully: " + element);
        return element;
    }

    @Override
    public void delete(T element) {
//        if (dataBase.contains(element)) {
//            dataBase.remove(element);
//            System.out.println("Following element was deleted successfully: " + element);
//        } else {
//            System.out.println(element + " has not been found.");
//        }
        dataBase.remove(element);
        System.out.println("Following element was deleted successfully: " + element);
    }

    @Override
    public void deleteAll(Set<T> list) {
        list = removeNulls(list);
        if (list.isEmpty()) {
            System.out.println("Your list is empty!");
            return;
        }
        if (dataBase.containsAll(list)) {
            dataBase.removeAll(list);
            System.out.println("All elements in the list were deleted successfully.");
            return;
        }
        for (T element : list) {
            delete(element);
        }
    }

    private Set<T> removeNulls(Set<T> list) {
        Set<T> result = new HashSet<T>();
        for (T element : list) {
            if (element != null) {
                result.add(element);
            }
        }
        return result;
    }

    @Override
    public void saveAll(Set<T> list) {
        if (dataBase.containsAll(list)) {
            return;
        }
        for (T element : list) {
            save(element);
        }
    }

    @Override
    public void deleteById(long id) {
        if (id == 0) {
            System.out.println("Please check the ID.");
            return;
        }
        for (T element : dataBase) {
            if (element.getId() == id) {
                delete(element);
                return;
            }
        }
    }

    @Override
    public T get(long id) {
        if (id == 0) {
            System.out.println("ID cannot be 0.");
            return null;
        }
        for (T element : dataBase) {
            if (element.getId() == id) {
                return element;
            }
        }
        System.out.println("Element with id " + id + " has not been found");
        return null;
    }

    @Override
    public Set<T> getDataBase() {
        return dataBase;
    }

    @Override
    public String toString() {
        return "DAO{" +
                "dataBase=" + dataBase +
                '}';
    }
}
