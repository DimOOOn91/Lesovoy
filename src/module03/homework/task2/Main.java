package module03.homework.task2;

public class Main {

    private static Integer a = 102;
    private static Integer b = 53;

    public static void main(String[] args) {

        Adder math = new Adder();
        if (math.check(a, b)) {
            System.out.println(math.add(a, b));
        } else {
            System.out.println("\"A\" less than \"B\"");
        }
    }

}
