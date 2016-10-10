package module08.homework;

import java.util.List;

public interface DAO<T> {
    T save(T element);
    void delete(T element);
    void deleteAll(List<T> list);
    void saveAll(List<T> list);
    List <T> getDataBase();
}
