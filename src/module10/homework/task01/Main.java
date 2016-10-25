package module10.homework.task01;

public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception("Task 1 Exception.");
        } catch (Exception e) {
            System.out.println("Exception in the Task " + e);
        } finally {
            System.out.println("Final logic");
        }
    }
}
