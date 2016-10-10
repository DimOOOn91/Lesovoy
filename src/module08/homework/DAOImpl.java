package module08.homework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DAOImpl<T> implements DAO<T> {

    private List<T> dataBase;

    public DAOImpl() {
        dataBase = new LinkedList<>();
    }

    @Override
    public T save(T element) {
        if (element != null) {
            dataBase.add(element);
            return element;
        }
        return null;
    }

    @Override
    public void delete(T element) {
        if (dataBase.contains(element)) {
            dataBase.remove(element);
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
        } else {
            List<T> notIdentified = new LinkedList<T>();
            for (T element : list) {
                if (dataBase.contains(element)) {
                    delete(element);
                } else {
                    notIdentified.add(element);
                }
            }
            System.out.println("Following elements have not been found in the DB:\n" + notIdentified);
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
        list = removeNulls(list);
        if (list.isEmpty()) {
            System.out.println("Your list is empty!");
            return;
        }
        dataBase.addAll(list);
    }

    public List<T> getDataBase() {
        return dataBase;
    }

    @Override
    public String toString() {
        return "DAOImpl{" +
                "dataBase=" + dataBase +
                '}';
    }
}
