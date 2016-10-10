package module07.homework.task4.module5;

import java.util.ArrayList;
import java.util.List;

public class RoomNewDaoImpl implements RoomNewDao {

    private static List<Room> dataBase = new ArrayList<>();

    @Override
    public boolean save(Room room) {
        if (dataBase.contains(room)) {
            return update(room);
        }
        dataBase.add(room);
        System.out.println(room + "was saved successfully!");
        return true;
    }

    @Override
    public boolean delete(Room room) {
        boolean result = dataBase.remove(room);

        if (result) {
            System.out.println(room + "was deleted successfully!");
            return true;
        }
        System.out.println(room + "has not been found.");
        return true;
    }

    @Override
    public boolean update(Room room) {
        int index = dataBase.indexOf(room);
        if (index < 0) {
            System.out.println(room + "has not been found.");
            return false;
        }
        dataBase.set(index, room);
        System.out.println("Your room has been updated successfully.");
        return true;
    }

    @Override
    public Room findById(long id) {
        for (Room room : dataBase) {
            if (room != null && room.getId() == id) {
                return room;
            }
        }
        return null;
    }

    @Override
    public List<Room> getAll() {
        return dataBase;
    }


}
