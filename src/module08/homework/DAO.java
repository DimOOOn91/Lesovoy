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
        if (element != null && !dataBase.contains(element)) {
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
                if (!dataBase.contains(element)) {
                    notIdentified.add(element);
                }
                delete(element);
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
        if (list.isEmpty() || dataBase.containsAll(list)) {
            return;
        }
        for (T element : list) {
            save(element);
            save(element);
        }
    }

    @Override
    public void deleteById(long id) {

        if (id == 0) {
            System.out.println("Please check the ID.");
            return;
        }
        Identity identity = new Identity() {
            @Override
            public long getId() {
                return id;
            }
        };
        if (dataBase.get(0).getClass().isAssignableFrom(identity.getClass())) {
            for (T element : dataBase) {
                if (element.getId() == id) {
                    dataBase.remove(element);
                    return;
                }
            }
        }
        System.out.println("This method cannot be used for your elements.");
    }

    @Override
    public T get(long id) {
        if (id == 0) {
            return null;
        }
        for (T element : dataBase) {
            if (element.getId() == id) {
                return element;
            }
        }
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
