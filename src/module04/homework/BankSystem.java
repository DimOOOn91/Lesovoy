package module04.homework;

public interface BankSystem {

    void withdrawOfUser(User user, int amount);

    void fundUser(User user, int amount);

    void transferMoney(User user1, User user2, int amount);

    void paySalary(User user);

}
