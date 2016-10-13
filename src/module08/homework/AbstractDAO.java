package module08.homework;

import java.util.List;

public interface AbstractDAO<T> {
    T save(T element);

    void delete(T element);

    void deleteAll(List<T> list);

    void saveAll(List<T> list);

    List<T> getDataBase();

    void deleteById(long id);

    T get(long id);
}
