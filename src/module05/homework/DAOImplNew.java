package module05.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class DAOImplNew implements DAONew {

    private ArrayList<Room> dataBase = new ArrayList<>();


    @Override
    public boolean save(Room room) {
        if (!checkUnique(room)) {
            System.out.println("Your room is already in data base please update it if it is necessary.");
            return false;
        }
        if (!checkPlaceInList()) {
            System.out.println("You data base is full, please delete some room!");
            return false;
        }
        dataBase.add(room);
        System.out.println(room + "was saved successfully!");
        return true;
    }

    private boolean checkUnique(Room room) {
        return findById(room.getId()) == null;
    }

    private boolean checkPlaceInList() {
        int newSize = dataBase.size() + 1;
        return newSize <= 10;
    }

    @Override
    public boolean delete(Room room) {
        Room roomInDB = findById(room.getId());
        if (roomInDB == null) {
            System.out.println(room + "has not been found.");
            return false;
        }
        dataBase.remove(roomInDB);
        System.out.println(room + "was deleted successfully!");
        return true;
    }

    @Override
    public boolean update(Room room) {
        Room roomInDB = findById(room.getId());
        if (roomInDB == null) {
            System.out.println(room + "has not been found.");
            return false;
        }
        int index = dataBase.indexOf(roomInDB);
        dataBase.remove(index);
        dataBase.add(index, room);
        System.out.println("Your room has been updated successfully.");
        return true;
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
        Room[] result = new Room[0];
        for (Room room : dataBase) {
            result = Arrays.copyOf(result, result.length + 1);
            result[result.length - 1] = room;
        }
//        return (Room[]) dataBase.toArray();
        return result;
    }


}
