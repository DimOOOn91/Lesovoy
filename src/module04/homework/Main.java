package module04.homework;

public class Main {
    private static Bank euBankEUR = new EUBank(1L, "Germany", Currency.EUR);
    private static Bank euBankUSD = new EUBank(2L, "France", Currency.USD);
    private static Bank usBankEUR = new USBank(3L, "USA", Currency.EUR);
    private static Bank usBankUSD = new USBank(4L, "USA", Currency.USD);
    private static Bank chinaBankEUR = new ChinaBank(5L, "Hong Kong", Currency.EUR);
    private static Bank chinaBankUSD = new ChinaBank(6L, "China", Currency.USD);

    private static User user1 = new User(1L, "Ivan", 500, 24, "Nestle", 800, euBankEUR);
    private static User user2 = new User(2L, "Lucian", 200, 10, "MHP", 500, euBankUSD);
    private static User user3 = new User(3L, "Sergiu", 50, 40, "Kernel", 700, usBankEUR);
    private static User user4 = new User(4L, "Dmitry", 2300, 12, "DHL", 400, usBankUSD);
    private static User user5 = new User(5L, "Oana", 1200, 15, "Deloitte", 1000, chinaBankEUR);
    private static User user6 = new User(6L, "Nikolay", 300.00, 2, "Cloudtop", 1500, chinaBankUSD);

    private static BankSystem bankSystem = new BankSystemImpl();

    public static void main(String[] args) {

        System.out.println(user1.toString());
        System.out.println(user2.toString());
        System.out.println(user3.toString());
        System.out.println(user4.toString());
        System.out.println(user5.toString());
        System.out.println(user6.toString());

        bankSystem.fundUser(user1, 2000);
        bankSystem.withdrawOfUser(user2, 540);
        bankSystem.paySalary(user3);
        bankSystem.transferMoney(user4, user5, 20);
        bankSystem.withdrawOfUser(user6, 100);

        System.out.println(user1.toString());
        System.out.println(user2.toString());
        System.out.println(user3.toString());
        System.out.println(user4.toString());
        System.out.println(user5.toString());
        System.out.println(user6.toString());
    }

}
