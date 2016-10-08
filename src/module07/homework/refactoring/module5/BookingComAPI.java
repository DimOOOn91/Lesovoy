package module07.homework.refactoring.module5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class BookingComAPI implements API {

    private static List<Room> rooms = new ArrayList<>();

    public BookingComAPI() {
        rooms.add(new Room(11111L, 400, 2, new Date("2016/09/29 12:00:00"), "Flagman", "Lvov"));
        rooms.add(new Room(11112L, 500, 3, new Date("2016/09/20 12:00:00"), "Chernomorec", "Odessa"));
        rooms.add(new Room(11113L, 480, 2, new Date("2016/10/04 12:00:00"), "Riviera", "Kiev"));
        rooms.add(new Room(11114L, 520, 4, new Date("2016/09/22 12:00:00"), "Flagman", "Lvov"));
        rooms.add(new Room(11115L, 600, 2, new Date("2016/09/20 12:00:00"), "Nemo", "Odessa"));
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
