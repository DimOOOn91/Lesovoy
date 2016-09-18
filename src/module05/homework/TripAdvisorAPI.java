package module05.homework;

import java.util.Date;

public class TripAdvisorAPI implements API {

    private static Room[] rooms = new Room[5];

    public TripAdvisorAPI() {
        rooms[0] = new Room(21111L, 280, 1, new Date("2016/09/18 12:00:00"), "Dobrynja", "Nikolaev");
        rooms[1] = new Room(21112L, 380, 2, new Date("2016/09/18 12:00:00"), "Morskoy", "Zheleznyi Port");
        rooms[2] = new Room(21113L, 320, 2, new Date("2016/09/18 12:00:00"), "Dolphin", "Zatoka");
        rooms[3] = new Room(21114L, 500, 2, new Date("2016/09/18 12:00:00"), "Fontan", "Odessa");
        rooms[4] = new Room(21115L, 600, 4, new Date("2016/09/18 12:00:00"), "Morskoy", "Zheleznyi Port");
    }

    @Override
    public Room[] getAllRooms() {
        return rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {

        Room requestedRoom = new Room(0L, price, persons, new Date(), hotel, city);

        return  DAO.findEqualRooms(requestedRoom, rooms);
    }

}
