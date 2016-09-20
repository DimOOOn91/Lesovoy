package module05.homework;

public interface DAO {
    Room save(Room room);

    boolean delete(Room room);

    Room update(Room room);

    Room findById(long id);

    static Room[] findEqualRooms(Room room, Room[] rooms) {
        int counter = 0;

        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].equals(room) && rooms[i].equalsHotelName(room)) {
                counter++;
            }
        }

        Room[] foundRooms;

        if (counter == 0) {
            return new Room[0];
        }

        foundRooms = new Room[counter];

        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].equals(room) && rooms[i].equalsHotelName(room)) {
                foundRooms[--counter] = rooms[i];
            }
        }
        return foundRooms;
    }

}
