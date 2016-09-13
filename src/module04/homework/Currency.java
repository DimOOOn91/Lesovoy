package module04.homework;

public enum Currency {

    USD(840),
    EUR(978);

    private int number;

    Currency(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
