package module05.homework;

import java.util.Arrays;
import java.util.Date;

public class GoogleAPI implements API {

    private static Room[] rooms = new Room[5];

    public GoogleAPI() {
        rooms[0] = new Room(31111L, 400, 2, new Date("2016/09/29 12:00:00"), "Flagman", "Kiev");
        rooms[1] = new Room(31112L, 320, 2, new Date("2016/09/18 12:00:00"), "Dolphin", "Zatoka");
        rooms[2] = new Room(31113L, 250, 2, new Date("2016/09/18 12:00:00"), "Mukachevo", "Mukachevo");
        rooms[3] = new Room(31114L, 600, 4, new Date("2016/09/18 12:00:00"), "Zolotoy", "Zheleznyi Port");
        rooms[4] = new Room(31115L, 500, 2, new Date("2016/09/18 12:00:00"), "Fontan", "Odessa");
    }

    @Override
    public Room[] getAllRooms() {
        return rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room requestedRoom = new Room(0L, price, persons, new Date(), hotel, city);
        Room[] result = new Room[0];
        for (Room room : rooms) {
            if (room.equals(requestedRoom) && hotel.equals(room.getHotelName())){
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = room;
            }
        }
        return result;
    }

}
