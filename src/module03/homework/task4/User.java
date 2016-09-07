package module03.homework.task4;

class User {
    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currancy;

    User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currancy) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currancy = currancy;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getBalance() {
        return balance;
    }

    void setBalance(int balance) {
        this.balance = balance;
    }

    int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    String getCompanyName() {
        return companyName;
    }

    void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    int getSalary() {
        return salary;
    }

    void setSalary(int salary) {
        this.salary = salary;
    }

    String getCurrancy() {
        return currancy;
    }

    void setCurrancy(String currancy) {
        this.currancy = currancy;
    }

    void paySalary() {
        balance += salary;
    }

    void withdraw(int summ) {
        if (checkBalance(summ)) {
            balance -= summ + commission(summ);
        } else {
            System.out.println("Not enough money on the balance.");
        }
    }

    private boolean checkBalance(int summ) {
        return balance - summ - commission(summ) >= 0;
    }

    private double commission(int summ) {
        if (summ < 1000) {
            return summ * 0.05;
        }
        return summ * 0.1;
    }

    int companyNameLength() {
        return companyName.length();
    }

    void monthIncreaser(int addMonth) {
        monthsOfEmployment += addMonth;
    }

}
