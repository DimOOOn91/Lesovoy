package module04.homework;

public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees,
                  double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.USD) {
            return 1000;
        } else if (getCurrency() == Currency.EUR) {
            return 1200;
        }
        return 0;
    }

    @Override
    int getLimitOfFunding() {
        if (getCurrency() == Currency.USD) {
            return Integer.MAX_VALUE;
        } else if (getCurrency() == Currency.EUR) {
            return 10000;
        }
        return 0;
    }

    @Override
    int getMonthlyRate() {
        if (getCurrency() == Currency.USD) {
            return 1;
        } else if (getCurrency() == Currency.EUR) {
            return 2;
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
            return 6;
        } else if (withdraw > 1000 && getCurrency() == Currency.EUR) {
            return 8;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "USBank{" +
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
