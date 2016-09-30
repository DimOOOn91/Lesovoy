package module05.homework;

import java.util.ArrayList;

public interface RoomNewDao {

    boolean save(Room room);

    boolean delete(Room room);

    boolean update(Room room);

    Room findById(long id);

    Room[] getAll();
}
