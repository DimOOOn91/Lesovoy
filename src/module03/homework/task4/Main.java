package module03.homework.task4;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("DimOOOn", 50000,3*12,"MHP", 18000, "UAH");

        user1.paySallery();
        user1.monthIncreaser(1);
        user1.setSalary(5000);
        user1.paySallery();
        user1.monthIncreaser(1);
        user1.withdraw(400);

        System.out.println(user1.getBalance());
        System.out.println(user1.getSalary());
        System.out.println(user1.getMonthsOfEmployment());
        System.out.println(user1.companyNameLength());

    }

}
