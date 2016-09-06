package module04.homework;

public class ChinaBank extends Bank {


    @Override
    public int getLimitOfWithdrawal() {
        switch (getCurrency()) {
            case USD:
                return 100;

            case EUR:
                return 150;
        }
        return -1;
    }

    @Override
    int getLimitOfFunding() {
        switch (getCurrency()) {
            case USD:
                return 10000;

            case EUR:
                return 5000;
        }
        return -1;
    }

    @Override
    double getMonthlyRate() {
        switch (getCurrency()) {
            case USD:
                return 0.01;

            case EUR:
                return 0;
        }
        return -1;
    }

    @Override
    double getCommission(int withdraw) {
        if (withdraw <= 1000){
            switch (getCurrency()){
                case USD:
                    return 0.03;

                case EUR:
                    return 0.10;
            }
        } else {
            switch (getCurrency()){
                case USD:
                    return 0.05;

                case EUR:
                    return 0.11;
            }
        }
        return 0;
    }

}
