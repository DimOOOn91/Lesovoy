package module10.homework.task02;

public class Main {
    public static void main(String[] args) {

        printOut("test");
    }

    public static void printOut(String s) {
        try {
            if (s.equals("test")) {
                throw new MyFirstException("My Exception");
            } else {
                System.out.println(s);
            }
        } catch (MyFirstException e) {
            System.out.println("Exception in the Task: " + e.getExceptionMessage());
        }
    }
}
