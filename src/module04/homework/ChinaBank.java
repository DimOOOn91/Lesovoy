package module04.homework;

public class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees,
                     double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.USD) {
            return 100;
        } else if (getCurrency() == Currency.EUR) {
            return 150;
        }
        return 0;
    }

    @Override
    int getLimitOfFunding() {
        if (getCurrency() == Currency.USD) {
            return 10_000;
        } else if (getCurrency() == Currency.EUR) {
            return 5_000;
        }
        return 0;
    }

    @Override
    int getMonthlyRate() {
        if (getCurrency() == Currency.USD) {
            return 1;
        } else if (getCurrency() == Currency.EUR) {
            return 0;
        }
        return 0;
    }

    @Override
    int getCommission(int withdraw) {
        if (withdraw <= 1000 && getCurrency() == Currency.USD) {
            return 3;
        } else if (withdraw > 1000 && getCurrency() == Currency.USD) {
            return 5;
        } else if (withdraw <= 1000 && getCurrency() == Currency.EUR) {
            return 10;
        } else if (withdraw > 1000 && getCurrency() == Currency.EUR) {
            return 11;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "ChinaBank{" +
                "id=" + getId() +
                ", bankCountry='" + getBankCountry() + '\'' +
                ", currency=" + getCurrency() +
                ", numberOfEmployees=" + getNumberOfEmployees() +
                ", avrSalaryOfEmployee=" + getAvrSalaryOfEmployee() +
                ", rating=" + getRating() +
                ", totalCapital=" + getTotalCapital() +
                '}';
    }

}
