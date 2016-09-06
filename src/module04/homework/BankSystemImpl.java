package module04.homework;

public class BankSystemImpl implements BankSystem {

    @Override
    public void withdrawOfUser(User user, int amount) {
        if (checkBankWithdrawalLimit(user, amount) && checkUserBalance(user, amount)) {
            user.setBalance(user.getBalance() - amount - commission(user, amount));
        }
    }

    @Override
    public void fundUser(User user, int amount) {
        if (checkBankFundingLimit(user, amount))
            user.setBalance(user.getBalance() + amount - commission(user, amount));
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
        if (user.getBank().getLimitOfWithdrawal() >= amount) {
            return true;
        } else {
            throw new RuntimeException("Current amount is out of " + user.getBank() + " limit.");
        }
    }

    private boolean checkUserBalance(User user, int amount) {
        if (user.getBalance() >= amount + user.getBank().getCommission(amount)) {
            return true;
        } else {
            throw new RuntimeException("Current amount cannot be taken from the balance of " + user.getName() + ".");
        }
    }

    private boolean checkBankFundingLimit(User user, int amount) {
        return user.getBank().getLimitOfFunding() >= amount;
    }
}
