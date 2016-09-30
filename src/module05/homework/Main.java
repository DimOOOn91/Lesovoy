package module05.homework;

import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        Controller controller = new Controller();
//
//        controller.requestRooms(400, 2, "Lvov", "Flagman");
//        System.out.println("\n-------------\n");
//
//        controller.requestRooms(280, 1, "Nikolaev", "Dobrynja");
//        System.out.println("\n-------------\n");
//
//        controller.requestRooms(320, 2, "Lvov", "Flagman");
//        System.out.println("\n-------------\n");
//
//        controller.requestRooms(400, 2, "", "Flagman");
//        System.out.println("\n-------------\n");
//        System.out.println("-------------\n");
//
//        API bookingCom = new BookingComAPI();
//        API google = new GoogleAPI();
//        API tripAdvisor = new TripAdvisorAPI();
//
//        System.out.println(Arrays.toString(controller.check(bookingCom, google)));
//        System.out.println("-------------\n");
//
//        System.out.println(Arrays.toString(controller.check(google, tripAdvisor)));
//        System.out.println("-------------\n");
//
//        System.out.println(Arrays.toString(controller.check(tripAdvisor, bookingCom)));
//        System.out.println("-------------\n");

        Room room1 = new Room(11111L, 400, 2, new Date("2016/10/01 12:00:00"), "Flagman", "Lvov");
        Room room2 = new Room(11112L, 500, 3, new Date("2016/09/20 12:00:00"), "Chernomorec", "Odessa");
        Room room3 = new Room(11113L, 480, 2, new Date("2016/10/04 12:00:00"), "Riviera", "Kiev");

        ControllerNew controller2 = new ControllerNew();

        controller2.save(room1);
        controller2.save(room1);
        controller2.save(room2);
        controller2.save(room3);

        System.out.println(Arrays.toString(controller2.getAll()));

//
//        System.out.println(Arrays.toString(controller2.getAll()));
//        System.out.println("----------------");
//
//        room3 = new Room(11113L, 500, 2, new Date("2016/10/04 12:00:00"), "Riviera", "Kiev");
//
        controller2.update(room3);
//        controller2.delete(room1);
//        controller2.delete(room1);
//
        System.out.println("----------------");
        System.out.println(Arrays.toString(controller2.getAll()));

    }
}
