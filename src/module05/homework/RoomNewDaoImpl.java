package module05.homework;

import java.util.ArrayList;
import java.util.List;

public class RoomNewDaoImpl implements RoomNewDao {

    private static List<Room> dataBase = new ArrayList<>();

    @Override
    public boolean save(Room room) {
        if (isContainInDB(room)) {
            update(room);
            return true;
        }
        if (!checkPlaceInList()) {
            System.out.println("You data base is full, please delete some room!");
            return false;
        }
        dataBase.add(room);
        System.out.println(room + "was saved successfully!");
        return true;
    }

    private boolean isContainInDB(Room room) {
        return findById(room.getId()) != null;
    }

    private boolean checkPlaceInList() {
        int newSize = dataBase.size() + 1;
        return newSize <= 10;
    }

    @Override
    public boolean delete(Room room) {
        if (isContainInDB(room)) {
            dataBase.remove(room);
            System.out.println(room + "was deleted successfully!");
            return true;
        }
        System.out.println(room + "has not been found.");
        return false;
    }

    @Override
    public boolean update(Room room) {
        int index = getIndexInDB(room);
        if (index < 0) {
            System.out.println(room + "has not been found.");
            return false;
        }
        dataBase.set(index, room);
        System.out.println("Your room has been updated successfully.");
        return true;
    }

    private int getIndexInDB(Room room) {
        Room roomInDB = findById(room.getId());
        int result = dataBase.indexOf(roomInDB);
        return result;
    }

    @Override
    public Room findById(long id) {
        for (int i = 0; i < dataBase.size(); i++) {
            Room room = dataBase.get(i);
            if (room != null && room.getId() == id) {
                return room;
            }
        }
        return null;
    }

    @Override
    public Room[] getAll() {
        return dataBase.toArray(new Room[dataBase.size()]);
    }


}
