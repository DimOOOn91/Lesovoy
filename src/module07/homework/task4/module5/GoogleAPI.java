package module07.homework.task4.module5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoogleAPI implements API {

    private static List<Room> rooms;

    public GoogleAPI() {
        rooms = new ArrayList<>();
        rooms.add(new Room(31111L, 400, 2, new Date("2016/09/29 12:00:00"), "Flagman", "Lvov"));
        rooms.add(new Room(31112L, 320, 2, new Date("2016/09/18 12:00:00"), "Dolphin", "Zatoka"));
        rooms.add(new Room(31113L, 250, 2, new Date("2016/09/18 12:00:00"), "Mukachevo", "Mukachevo"));
        rooms.add(new Room(31114L, 600, 4, new Date("2016/09/18 12:00:00"), "Zolotoy", "Zheleznyi Port"));
        rooms.add(new Room(31115L, 500, 2, new Date("2016/09/18 12:00:00"), "Fontan", "Odessa"));
    }

    @Override
    public List<Room> getAllRooms() {
        return rooms;
    }

    @Override
    public List<Room> findRooms(int price, int persons, String city, String hotel) {
        Room requestedRoom = new Room(0L, price, persons, new Date(), hotel, city);
        List<Room> result = new ArrayList<>();
        for (Room room : rooms) {
            if (room.checkForEqual(requestedRoom) && hotel.equals(room.getHotelName())) {
                result.add(room);
            }
        }
        return result;
    }

}
