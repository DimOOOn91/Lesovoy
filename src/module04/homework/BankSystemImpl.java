package module04.homework;

public class BankSystemImpl implements BankSystem {

    @Override
    public void withdrawOfUser(User user, int amount) {
        if (!checkBankWithdrawalLimit(user, amount)) {
            System.out.println("Withdraw for user" + user.getId() + " is impossible because it is out of his Bank withdrawal limit.");
            return;
        }
        if (!checkUserBalance(user, amount)) {
            System.out.println("User" + user.getId()+ " balance has not enough funds to cover the withdraw.");
            return;
        }
        user.setBalance(user.getBalance() - amount - commission(user, amount));
    }

    @Override
    public void fundUser(User user, int amount) {
        if (!checkBankFundingLimit(user, amount)){
            System.out.println("Withdraw for user" + user.getId() + " is impossible because it is out of his Bank funding limit.");
            return;
        }
            user.setBalance(user.getBalance() + amount);
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        withdrawOfUser(fromUser, amount);
        fundUser(toUser, amount);
    }

    @Override
    public void paySalary(User user) {
        user.setBalance(user.getBalance() + user.getSalary());
    }

    private double commission(User user, int amount) {
        return amount * user.getBank().getCommission(amount);
    }

    private boolean checkBankWithdrawalLimit(User user, int amount) {
        return amount <= user.getBank().getLimitOfWithdrawal();
    }

    private boolean checkUserBalance(User user, int amount) {
        return user.getBalance() >= amount + user.getBank().getCommission(amount);
    }

    private boolean checkBankFundingLimit(User user, int amount) {
        return user.getBank().getLimitOfFunding() >= amount;
    }

}
