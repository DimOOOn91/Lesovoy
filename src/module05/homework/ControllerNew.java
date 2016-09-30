package module05.homework;

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

    public Room[] getAll() {
        return dao.getAll();
    }


}
