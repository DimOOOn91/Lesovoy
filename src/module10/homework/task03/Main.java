package module10.homework.task03;

public class Main {
    public static void main(String[] args) {
        Object o = null;
        try {
            System.out.println(o.hashCode());
        } catch (NullPointerException e) {
            System.out.println("Please check your Object, it cannot be null");
        } finally {
            System.out.println("Task 3 checked!");
        }
    }
}
