package module07.homework.task4.module5;

public interface DAO {
    Room save(Room room);

//    List<Room> save(List<Room> rooms);

    boolean delete(Room room);

    Room update(Room room);

    Room findById(long id);

}
