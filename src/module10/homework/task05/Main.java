package module10.homework.task05;

public class Main {
    public static void main(String[] args) {

        try {
            runException(2);
//        } catch (Exception e) {
        } catch (ExceptionOne | ExceptionTwo | ExceptionThree e) {
            System.out.println("EXCEPTION: " + e);
        }

    }

    public static void runException(int i) throws ExceptionOne, ExceptionTwo, ExceptionThree {
        if (i == 1) {
            throw new ExceptionOne("Exception one");
        } else if (i == 2) {
            throw new ExceptionTwo("Exception two");
        } else if (i == 3) {
            throw new ExceptionThree("Exception three");
        } else {
            System.out.println("Please input number 1, 2 or 3");
        }
    }

}
