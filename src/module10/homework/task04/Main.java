package module10.homework.task04;

import module10.homework.task02.MySecondException;

public class Main {
    public static void main(String[] args) {

        try {
            TestException.f();
        } catch (MySecondException e) {
            System.out.println("RuntimeException in f() method " + e);
        }
    }
}
