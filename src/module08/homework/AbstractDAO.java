package module08.homework;

import java.util.Set;

public interface AbstractDAO<T> {
    T save(T element);

    void delete(T element);

    void deleteAll(Set<T> list);

    void saveAll(Set<T> list);

    Set<T> getDataBase();

    void deleteById(long id);

    T get(long id);
}
