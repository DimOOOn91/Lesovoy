package module07.homework.refactoring.module5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class TripAdvisorAPI implements API {

    private static List<Room> rooms = new ArrayList<>();

    public TripAdvisorAPI() {
        rooms.add(new Room(21111L, 280, 1, new Date("2016/09/18 12:00:00"), "Dobrynja", "Nikolaev"));
        rooms.add(new Room(21112L, 380, 2, new Date("2016/09/18 12:00:00"), "Morskoy", "Zheleznyi Port"));
        rooms.add(new Room(21113L, 320, 2, new Date("2016/09/18 12:00:00"), "Dolphin", "Zatoka"));
        rooms.add(new Room(21114L, 500, 2, new Date("2016/09/18 12:00:00"), "Fontan", "Odessa"));
        rooms.add(new Room(21115L, 600, 4, new Date("2016/09/18 12:00:00"), "Morskoy", "Zheleznyi Port"));
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
