package module05.homework;

import java.util.Arrays;

public class Controller {

    private API[] apis;

    public Controller() {
        this.apis = new API[]{new GoogleAPI(), new BookingComAPI(), new TripAdvisorAPI()};
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel) {
        Room[] result = new Room[0];
        DAO dao = new DAOImpl();
        for (API api : apis) {
            Room[] foundRooms = api.findRooms(price, persons, city, hotel);
            for (Room room : foundRooms) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = room;
                dao.save(room);
            }
        }
        if (result.length == 0) {
            System.out.println("Sorry but rooms with the requested criteria have not been found.");
        } else {
            System.out.println("\n" + result.length + " rooms With the requested criteria were found.");
        }
        return result;
    }

    public Room[] check(API api1, API api2) {
        Room[] arrayApi1 = api1.getAllRooms();
        Room[] arrayApi2 = api2.getAllRooms();
        Room[] result = new Room[0];
        for (Room room1 : arrayApi1) {
            for (Room room2 : arrayApi2) {
                if (room1.checkForEqual(room2)) {
                    result = Arrays.copyOf(result, result.length + 1);
                    result[result.length - 1] = room1;
                }
            }
        }
        System.out.println("\n" + result.length + " matches have been found.");
        return result;
    }

}
