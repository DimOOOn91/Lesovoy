package module10.homework.task02;

public class MyFirstException extends Exception {

    private String exceptionMessage;

    public MyFirstException(String message) {
        exceptionMessage = message;
    }

    public String getExceptionMessage() {
        return exceptionMessage;
    }
}
