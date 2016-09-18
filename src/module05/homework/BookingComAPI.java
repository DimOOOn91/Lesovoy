package module05.homework;

import java.util.Date;

public class BookingComAPI implements API {

    private static Room[] rooms = new Room[5];

    public BookingComAPI() {
        rooms[0] = new Room(11111L, 400, 2, new Date("2016/10/01 12:00:00"), "Flagman", "Lvov");
        rooms[1] = new Room(11112L, 500, 3, new Date("2016/09/20 12:00:00"), "Chernomorec", "Odessa");
        rooms[2] = new Room(11113L, 480, 2, new Date("2016/10/04 12:00:00"), "Riviera", "Kiev");
        rooms[3] = new Room(11114L, 520, 4, new Date("2016/09/22 12:00:00"), "Flagman", "Lvov");
        rooms[4] = new Room(11115L, 600, 2, new Date("2016/09/20 12:00:00"), "Nemo", "Odessa");
    }

    @Override
    public Room[] getAllRooms() {
        return rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {

        Room requestedRoom = new Room(0L, price, persons, new Date(), hotel, city);

        return DAO.findEqualRooms(requestedRoom, rooms);
    }

}
