package module04.homework;

public class Main {
    private static Bank euBankEUR = new EUBank(1L, "Germany", Currency.EUR, 25, 5_000, 65, 7_000_000);
    private static Bank euBankUSD = new EUBank(2L, "France", Currency.USD, 42, 4_500, 42, 6_000_000);
    private static Bank usBankEUR = new USBank(3L, "USA", Currency.EUR, 30, 6_000, 50, 7_777_000);
    private static Bank usBankUSD = new USBank(4L, "USA", Currency.USD, 27, 5_500, 60, 8_000_000);
    private static Bank chinaBankEUR = new ChinaBank(5L, "Hong Kong", Currency.EUR, 50, 4_000, 78, 12_000_000);
    private static Bank chinaBankUSD = new ChinaBank(6L, "China", Currency.USD, 45, 5_000, 65, 9_000_000);

    private static User user1 = new User(1L, "Ivan", 500, 24, "Nestle", 800, euBankEUR);
    private static User user2 = new User(2L, "Lucian", 200, 10, "MHP", 500, euBankUSD);
    private static User user3 = new User(3L, "Sergiu", 50, 40, "Kernel", 700, usBankEUR);
    private static User user4 = new User(4L, "Dmitry", 2300, 12, "DHL", 400, usBankUSD);
    private static User user5 = new User(5L, "Oana", 1200, 15, "Deloitte", 1000, chinaBankEUR);
    private static User user6 = new User(6L, "Nikolay", 300.00, 2, "Cloudtop", 1500, chinaBankUSD);

    private static BankSystem bankSystem = new BankSystemImpl();
    private static User[] users = new User[]{user1, user2, user3, user4, user5, user6};

    private static void operationsWithUsers(User[] usersArray) {
        for (int i = 0; i < usersArray.length; i++) {
            System.out.println(users[i].toString());
            bankSystem.withdrawOfUser(usersArray[i], 540);
            bankSystem.paySalary(usersArray[i]);
            bankSystem.fundUser(usersArray[i], 2000);
            if (i < usersArray.length - 1) {
                bankSystem.transferMoney(usersArray[i], usersArray[i + 1], 20);
            } else {
                bankSystem.transferMoney(usersArray[i], usersArray[0], 20);
            }
            System.out.println(users[i].toString() + "\n-------");
        }
    }

    public static void main(String[] args) {

        operationsWithUsers(users);

    }

}
