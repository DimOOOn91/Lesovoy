package module04.homework;

public class Main {
    public static void main(String[] args) {
        Bank euBankEUR = new EUBank(00001, "Germany", Currency.EUR);
        Bank euBankUSD = new EUBank(00002, "France", Currency.USD);
        Bank usBankEUR = new USBank(00003, "USA", Currency.EUR);
        Bank usBankUSD = new USBank(00004, "USA", Currency.USD);
        Bank chinaBankEUR = new ChinaBank(00005, "Hong Kong", Currency.EUR);
        Bank chinaBankUSD = new ChinaBank(00006, "China", Currency.USD);

        User user1 = new User(0000001, "Ivan", 10000.00, 24, "Nestle", 800, euBankEUR);
        User user2 = new User(0000002, "Andrey", 2000.00, 10, "MHP", 500, euBankUSD);
        User user3 = new User(0000003, "Sergey", 50000.00, 40, "Kernel", 700, usBankEUR);
        User user4 = new User(0000004, "Dmitriy", 9000.00, 12, "DHL", 400, usBankUSD);
        User user5 = new User(0000005, "Inna", 12000.00, 15, "Deloitte", 1000, chinaBankEUR);
        User user6 = new User(0000006, "Nikolay", 300.00, 2, "Cloudtop", 1500, chinaBankUSD);

        user1.toString();

    }
}
