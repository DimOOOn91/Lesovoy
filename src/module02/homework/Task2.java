package module02.homework;

public class Task2 {

    static int[] balances = {1200, 250, 2000, 500, 3200};
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

    public static void main(String[] args) {

        //HOMEWORK 2.2
        double balance = 45;
        double withdrowal = 40;
        if (checkBalance(balance, withdrowal)) {
            System.out.println("OK " + commission(withdrowal) + " " + withdrawBalance(balance, withdrowal));
        } else {
            System.out.println("NO");
        }

        //HOMEWORK 2.3
        String ownerName = "Oww";
        double withdrowal2 = 490;
        if (checkBalance(getBalanceByName(ownerName), withdrowal2)) {
            System.out.println(ownerName + " " + withdrowal2 + " " + withdrawBalance(ownerName, withdrowal2));
        } else {
            System.out.println(ownerName + " NO");
        }

        //HOMEWORK 2.4
        String ownerName2 = "Oww";
        double fund = 100;
        System.out.println(ownerName2 + " " + fundBalance(getBalanceByName(ownerName2), fund));
    }

    private static double commission(double withdrowal) {
        return withdrowal * 0.05;
    }

    private static boolean checkBalance(double balance, double withdrowal) {
        return withdrowal * 1.05 <= balance;
    }

    private static double getBalanceByName(String ownerName) {
        for (int item = 0; item < ownerNames.length; item++) {
            if (ownerNames[item] == ownerName) {
                return balances[item];
            }
        }
        return -1;
    }

    static double withdrawBalance(double balance, double withdrawal) {
        return balance - withdrawal - commission(withdrawal);
    }

    static double withdrawBalance(String ownerName, double withdrawal) {
        if (checkBalance(getBalanceByName(ownerName), withdrawal)) {
            return withdrawBalance(getBalanceByName(ownerName), withdrawal);
        }
        return -1;
    }

    private static double fundBalance(double balance, double fund) {
        return balance + fund;
    }

}
