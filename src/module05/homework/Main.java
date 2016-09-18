package module05.homework;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.requestRooms(400, 2, "Lvov", "Flagman");
        System.out.println("-------------\n");

        controller.requestRooms(280, 1, "Nikolaev", "Dobrynja");
        System.out.println("-------------\n");

        controller.requestRooms(320, 2, "Lvov", "Flagman");
        System.out.println("-------------\n");
        System.out.println("-------------\n");


        API bookingCom = new BookingComAPI();
        API google = new GoogleAPI();
        API tripAdvisor = new TripAdvisorAPI();

        System.out.println(Arrays.toString(controller.check(bookingCom, google)));
        System.out.println("-------------\n");

        System.out.println(Arrays.toString(controller.check(google, tripAdvisor)));
        System.out.println("-------------\n");

        System.out.println(Arrays.toString(controller.check(tripAdvisor, bookingCom)));
        System.out.println("-------------\n");

    }
}
