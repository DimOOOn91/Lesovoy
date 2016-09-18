package module05.homework;

import java.util.Date;

public class DAOImpl implements DAO {
    @Override
    public Room save(Room room) {
        System.out.println(room.toString()+ " was saved.");
        return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println(room.toString() + " was deleted.");
        return true;
    }

    @Override
    public Room update(Room room) {
        System.out.println(room.toString() + " was updated.");
        return room;
    }

    @Override
    public Room findById(long id) {
        Room foundRoom = new Room(id, 400, 2, new Date(), "Flagman", "Lviv");
        System.out.println("Room with ID " + id + " was found: \n" + foundRoom.toString());
        return foundRoom;
    }

}
