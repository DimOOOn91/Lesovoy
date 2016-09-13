package module04.homework;

public class EUBank extends Bank {

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees,
                  double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.USD) {
            return 2000;
        } else if (getCurrency() == Currency.EUR) {
            return 2200;
        }
        return 0;
    }

    @Override
    int getLimitOfFunding() {
        if (getCurrency() == Currency.USD) {
            return 10000;
        } else if (getCurrency() == Currency.EUR) {
            return 20000;
        }
        return 0;
    }

    @Override
    int getMonthlyRate() {
        if (getCurrency() == Currency.USD) {
            return 0;
        } else if (getCurrency() == Currency.EUR) {
            return 1;
        }
        return 0;
    }

    @Override
    int getCommission(int withdraw) {
        if (withdraw <= 1000 && getCurrency() == Currency.USD) {
            return 5;
        } else if (withdraw > 1000 && getCurrency() == Currency.USD) {
            return 7;
        } else if (withdraw <= 1000 && getCurrency() == Currency.EUR) {
            return 2;
        } else if (withdraw > 1000 && getCurrency() == Currency.EUR) {
            return 4;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "EUBank{" +
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
