package module10.homework.task04;

import module10.homework.task02.MyFirstException;

public class TestException {

    public static void f(){
        try {
            g();
        } catch (MyFirstException e) {
            System.out.println(e);
            throw new RuntimeException("Inside the catch");
        }
    }

    private static void g() throws MyFirstException {
        throw new MyFirstException("TestException");
    }


}
