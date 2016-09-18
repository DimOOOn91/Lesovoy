package module05.homework;

public interface DAO {
    Room save(Room room);

    boolean delete(Room room);

    Room update(Room room);

    Room findById(long id);

    static Room[] findEqualRooms (Room room, Room[] rooms){
        int index = 0;

        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].equals(room)) {
                index++;
            }
        }

        Room[] foundRooms;

        if (index == 0) {
            return new Room[0];
        } else {
            foundRooms = new Room[index];
            index = 0;
        }

        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].equals(room)) {
                foundRooms[index] = rooms[i];
                index++;
            }
        }
        return foundRooms;
    };

}
