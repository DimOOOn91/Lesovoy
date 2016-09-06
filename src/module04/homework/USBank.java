package module04.homework;

public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency) {
        super(id, bankCountry, currency);
    }

    @Override
    public int getLimitOfWithdrawal() {
        switch (getCurrency()) {
            case USD:
                return 1000;

            case EUR:
                return 1200;
        }
        return -1;
    }

    @Override
    int getLimitOfFunding() {
        switch (getCurrency()) {
            case USD:
                return 0;

            case EUR:
                return 10000;
        }
        return -1;
    }

    @Override
    double getMonthlyRate() {
        switch (getCurrency()) {
            case USD:
                return 0.01;

            case EUR:
                return 0.015;
        }
        return -1;
    }

    @Override
    double getCommission(int withdraw) {
        if (withdraw <= 1000){
            switch (getCurrency()){
                case USD:
                    return 0.05;

                case EUR:
                    return 0.06;
            }
        } else {
            switch (getCurrency()){
                case USD:
                    return 0.07;

                case EUR:
                    return 0.08;
            }
        }
        return 0;
    }

}
