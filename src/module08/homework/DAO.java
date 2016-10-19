package module08.homework;

import java.util.LinkedList;
import java.util.List;

public class DAO<T extends Identity> implements AbstractDAO<T> {

    private List<T> dataBase;

    public DAO() {
        dataBase = new LinkedList<>();
    }

    @Override
    public T save(T element) {
        if (element == null || dataBase.contains(element)) {
            System.out.println("This User cannot be saved");
            return null;
        }
        dataBase.add(element);
        System.out.println("Following element was saves successfully: " + element);
        return element;
    }

    @Override
    public void delete(T element) {
        if (dataBase.contains(element)) {
            dataBase.remove(element);
            System.out.println("Following element was deleted successfully: " + element);
        } else {
            System.out.println(element + " has not been found.");
        }
    }

    @Override
    public void deleteAll(List<T> list) {
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

    private List<T> removeNulls(List<T> list) {
        List<T> result = new LinkedList<>();
        for (T element : list) {
            if (element != null) {
                result.add(element);
            }
        }
        return result;
    }

    @Override
    public void saveAll(List<T> list) {
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
    public List<T> getDataBase() {
        return dataBase;
    }

    @Override
    public String toString() {
        return "DAO{" +
                "dataBase=" + dataBase +
                '}';
    }
}
