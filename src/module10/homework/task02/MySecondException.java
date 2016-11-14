package module10.homework.task02;

public class MySecondException extends Exception {

    private String exceptionMessage;

    public MySecondException(String message) {
        exceptionMessage = message;
    }

    public String getExceptionMessage() {
        return exceptionMessage;
    }
}
