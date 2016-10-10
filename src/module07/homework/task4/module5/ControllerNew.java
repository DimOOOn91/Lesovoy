package module07.homework.task4.module5;

import java.util.List;

public class ControllerNew {

    private RoomNewDao dao = new RoomNewDaoImpl();

    public Room save(Room room) {
        dao.save(room);
        return room;
    }

    public boolean delete(Room room) {
        return dao.delete(room);
    }

    public Room update(Room room) {
        dao.update(room);
        return room;
    }

    public Room findById(long id) {
        return dao.findById(id);
    }

    public List<Room> getAll() {
        return dao.getAll();
    }


}
