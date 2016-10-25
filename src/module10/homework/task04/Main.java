package module10.homework.task04;

public class Main {
    public static void main(String[] args) {

        try {
            TestException.f();
        } catch (RuntimeException e) {
            System.out.println("RuntimeException in f() method " + e);
        }
    }
}
