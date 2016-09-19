package module05.homework;

public class Controller {
    private API googleAPI = new GoogleAPI();
    private API bookingComAPI = new BookingComAPI();
    private API tripAdvisorAPI = new TripAdvisorAPI();
    API[] apis = new API[] {googleAPI, bookingComAPI, tripAdvisorAPI};

    public Room[] requestRooms(int price, int persons, String city, String hotel) {

        Room[] googleAPIRooms = apis[0].findRooms(price, persons, city, hotel);
        Room[] bookingComAPIRooms = apis[1].findRooms(price, persons, city, hotel);
        Room[] tripAdvisorAPIRooms = apis[2].findRooms(price, persons, city, hotel);

        Room[] requestedRooms = new Room[googleAPIRooms.length + bookingComAPIRooms.length + tripAdvisorAPIRooms.length];

        System.arraycopy(googleAPIRooms, 0, requestedRooms, 0, googleAPIRooms.length);
        System.arraycopy(bookingComAPIRooms, 0, requestedRooms, googleAPIRooms.length, bookingComAPIRooms.length);
        System.arraycopy(tripAdvisorAPIRooms, 0, requestedRooms, googleAPIRooms.length + bookingComAPIRooms.length, tripAdvisorAPIRooms.length);

        if (requestedRooms.length == 0) {
            System.out.println("Sorry but rooms with the requested criteria have not been found.");
        } else {
            System.out.println("With the requested criteria were found " + requestedRooms.length + " rooms. Please find them below:");

            DAO dao = new DAOImpl();

            for (Room room : requestedRooms) {
            dao.save(room);
            }
        }

        return requestedRooms;
    }

    public Room[] check(API api1, API api2) {

        Room[] arrayApi1 = api1.getAllRooms();
        Room[] arrayApi2 = api2.getAllRooms();
        Room[] tempRooms = new Room[arrayApi1.length + arrayApi2.length];
        int index = 0;

        for (int i = 0; i < arrayApi1.length; i++) {
            Room[] equalRooms = DAO.findEqualRooms(arrayApi1[i], arrayApi2);
            if (equalRooms.length != 0) {
                tempRooms[index] = arrayApi1[i];
                System.arraycopy(equalRooms, 0, tempRooms, index + 1, equalRooms.length);
                index += equalRooms.length + 1;
            }
        }

        Room[] result;

        if (index == 0) {
            System.out.println("0 matches has been found.");
            return new Room[0];
        } else {
            result = new Room[index];
        }

        for (int i = index - 1; i >= 0; i--) {
            result[i] = tempRooms[i];
        }
        return result;
    }

}
