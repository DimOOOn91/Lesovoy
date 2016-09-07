package module04.homework;

public class EUBank extends Bank {

    EUBank(long id, String bankCountry, Currency currency) {
        super(id, bankCountry, currency);
    }

    @Override
    public int getLimitOfWithdrawal() {
        switch (getCurrency()) {
            case USD:
                return 2000;

            case EUR:
                return 2200;
        }
        return -1;
    }

    @Override
    int getLimitOfFunding() {
        switch (getCurrency()) {
            case USD:
                return 10000;

            case EUR:
                return 20000;
        }
        return -1;
    }

    @Override
    double getMonthlyRate() {
        switch (getCurrency()) {
            case USD:
                return 0;

            case EUR:
                return 0.01;
        }
        return -1;
    }

    @Override
    double getCommission(int withdraw) {
        if (withdraw <= 1000) {
            switch (getCurrency()) {
                case USD:
                    return 0.05;

                case EUR:
                    return 0.02;
            }
        } else {
            switch (getCurrency()) {
                case USD:
                    return 0.07;

                case EUR:
                    return 0.04;
            }
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
