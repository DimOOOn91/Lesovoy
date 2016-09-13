package module04.homework;

public class BankSystemImpl implements BankSystem {

    @Override
    public void withdrawOfUser(User user, int amount) {
        Bank userBank = user.getBank();

        if (!checkBankWithdrawalLimit(userBank, amount)) {
            System.out.println("Withdraw for user" + user.getId() + " is impossible because it is out of his Bank limit.");
            return;
        }

        double amountWithCommission = amountWithCommission(userBank, amount);

        if (!(user.getBalance() >= amountWithCommission)) {
            System.out.println("User" + user.getId()+ " balance has not enough funds to cover the withdraw.");
            return;
        }
        user.setBalance(user.getBalance() - amountWithCommission);
    }

    @Override
    public void fundUser(User user, int amount) {
        Bank userBank = user.getBank();
        if (!checkBankFundingLimit(userBank, amount)){
            System.out.println("Funding for user" + user.getId() + " is impossible because it is out of his Bank  limit.");
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
        fundUser(user, user.getSalary());
    }

    private double commissionSum(Bank userBank, int amount) {
        return amount * userBank.getCommission(amount) / 100;
    }

    private boolean checkBankWithdrawalLimit(Bank userBank, int amount) {
        return amount <= userBank.getLimitOfWithdrawal();
    }

    private boolean checkBankFundingLimit(Bank userBank, int amount) {
        return userBank.getLimitOfFunding() >= amount;
    }

    private double amountWithCommission(Bank userBank, int amount) {
        return amount + commissionSum(userBank, amount);
    }

}
