package module10.homework.task04;

import module10.homework.task02.MyFirstException;
import module10.homework.task02.MySecondException;

public class TestException {

    public static void f() throws MySecondException {
        try {
            g();
        } catch (MyFirstException e) {
            System.out.println(e);
            throw new MySecondException("Inside the catch");
        }
    }

    private static void g() throws MyFirstException {
        throw new MyFirstException("TestException");
    }


}
