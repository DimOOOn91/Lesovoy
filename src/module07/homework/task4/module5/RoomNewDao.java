package module07.homework.task4.module5;

import java.util.List;

public interface RoomNewDao {

    boolean save(Room room);

    boolean delete(Room room);

    boolean update(Room room);

    Room findById(long id);

    List<Room> getAll();
}
